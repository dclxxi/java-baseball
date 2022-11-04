package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Computer {
    public List<Integer> getNumber() {
        Set<Integer> computerNumbers = new HashSet<>();

        while (computerNumbers.size() < Config.DIGIT_SIZE) {
            int computerNumber = Randoms.pickNumberInRange(Config.DIGIT_MAX, Config.DIGIT_MIN);
            computerNumbers.add(computerNumber);
        }

        return new ArrayList<>(computerNumbers);
    }
}
