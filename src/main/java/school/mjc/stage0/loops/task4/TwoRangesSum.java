package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {

        if (numberToSkip > lastInRow) System.out.println("number to skip is bigger then the last");
        else if (lastInRow < 0) System.out.println("last number in row is negative");
        else {
            int skipedSum = 0;
            int countedSum = 0;
            for (int i = 0; i <= lastInRow; i++) {
                if (i <= numberToSkip) {
                    skipedSum += i;

                    continue;
                }

                countedSum += i;
            }
            System.out.println("skipped sum is " + skipedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
