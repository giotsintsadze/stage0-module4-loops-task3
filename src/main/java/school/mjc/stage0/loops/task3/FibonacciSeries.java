package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println(firstTerm);
        System.out.println(secondTerm);

        for (int i = 2; i < lastFibonacci; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
