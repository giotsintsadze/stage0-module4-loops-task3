package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t < 0) {
            t = -t;
        }

        String numberString = t + "";
        int sum = 0;

        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            int digit = digitChar - '0';
            sum += digit;
        }

        System.out.println(sum);
    }
}
