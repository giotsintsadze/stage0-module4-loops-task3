package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        first = Math.abs(first);
        second = Math.abs(second);

        if (first < 0 && second <0){
            System.out.println("numbers are not positives");
        } else {
            while (second != 0) {
                int temp = second;
                second = first % second;
                first = temp;
            }
        }
        System.out.println(first);
    }
}
