import java.util.Random;
import java.util.Arrays;

public class Main {

    public static final float TIMEFACTOR = 1000000f;

    public static void main(String[] args) {
            Integer[] unsortedData = new Integer[64];
            Random gen = new Random();
            for(int i = 0; i < unsortedData.length; i++) {
                unsortedData[i] = gen.nextInt(4096);
            }
            Integer[] copy1 = unsortedData.clone();
            Integer[] copy2 = unsortedData.clone();
            Sorter<Integer> bubble = new BubbleSorter<>();

            System.out.println("Starting bubble sort.");
            long startTime = System.nanoTime();
            bubble.sort(copy1);
            long endTime = System.nanoTime();
            System.out.println("\tElapsed Time: " + (endTime - startTime) / TIMEFACTOR + " seconds.");

            System.out.println("Starting insertion sort.");
            Sorter<Integer> insertion = new InsertionSorter<>();
            startTime = System.nanoTime();
            insertion.sort(copy2);
            endTime = System.nanoTime();
            System.out.println("\tElapsed Time: " + (endTime - startTime) / TIMEFACTOR + " seconds.");
        }
}