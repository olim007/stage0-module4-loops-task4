package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int s = 0;
        for (int i = 1; i <= numberToSkip; i++) {
            s += i;
        }
        int count = 0;
        for (int i = numberToSkip + 1; i <= lastInRow; i++) {
            count += i;
        }
        if (numberToSkip > lastInRow && lastInRow != -1) {
            System.out.println("number to skip is bigger then the last");
        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            System.out.println("skipped sum is " + s + "\ncounted sum is " + count);
        }

    }
}
