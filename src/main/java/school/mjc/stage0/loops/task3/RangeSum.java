package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int smaller = Math.min(firstBoarder, secondBoarder);
        int larger = Math.max(firstBoarder, secondBoarder);

        int sum = 0;

        for (int current = smaller; current <= larger; current++) {
            sum += current;
        }

        System.out.println(sum);
    }
}
