package baseball;

import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Baseball {
    private final Computer computer;
    private final Player player;
    private List<Integer> computerNumbers;
    private List<Integer> playerNumbers;

    Baseball() {
        computer = new Computer();
        player = new Player();
    }

    public void startGame() {
        OutputView.printStart();
        playGame();
    }

    private void playGame() {
        setComputerNumbers();

        while (!isGameOver()) {
            setPlayerNumbers();
            printHintMessage();
        }
    }

    private void setComputerNumbers() {
        computer.setNumbers();
        this.computerNumbers = computer.getNumbers();
    }

    private void setPlayerNumbers() {
        String playerNumber = InputView.inputPlayerNumber();
        player.validatePlayerNumber(playerNumber);
        player.setNumbers(playerNumber);

        this.playerNumbers = player.getPlayerNumbers();
    }

    private void printHintMessage() {
        player.setHintCount(computerNumbers, playerNumbers);
        String hintMessage = player.getHintMessage();
        OutputView.printHintMessage(hintMessage);
    }

    private boolean isGameOver() {
        if (player.isMaxStrike()) {
            if (isStateShutDown()) {
                OutputView.printGameOver();
                return true;
            }

            setComputerNumbers();
            return false;
        }
        return false;
    }

    private boolean isStateShutDown() {
        String stateNumber = getStateNumber();
        return State.SHUTDOWN.getNumber().equals(stateNumber);
    }

    private String getStateNumber() {
        String stateNumber = InputView.inputStateNumber();
        player.validateStateNumber(stateNumber);

        return stateNumber;
    }
}