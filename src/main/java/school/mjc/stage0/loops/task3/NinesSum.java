package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println(0);
            return;
        }

        int sum = 0;
        int multiplier = 1;
        int currentNumber = 0;

        for (int i = 1; i <= lengthOfLastNumber; i++) {
            currentNumber += 9 * multiplier;
            sum += currentNumber;
            multiplier *= 10;
        }

        System.out.println(sum);
    }
}
