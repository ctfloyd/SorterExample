import java.lang.Comparable;

public class BubbleSorter<T extends Comparable<T>> implements Sorter<T> {

    public void swap(T[] toSort, int i, int j) {
        T temp = toSort[i];
        toSort[i] = toSort[j];
        toSort[j] = temp;
    }

    @Override
    public void sort(T[] toSort) {
         for(int i = 0; i < toSort.length - 1; i++) {
             for(int j = 0; j < toSort.length - i - 1; j++) {
                if(toSort[j].compareTo(toSort[j + 1]) > 0) {
                    swap(toSort, j, j + 1);
                }
            }
         }
    }
}