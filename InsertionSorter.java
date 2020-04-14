import java.lang.Comparable;

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public void sort(T[] toSort) {
       for(int i = 1; i < toSort.length; i++) {
           T key = toSort[i];
           int j = i - 1;

           while(j >= 0 && toSort[j].compareTo(key) > 0) {
               toSort[j + 1] = toSort[j];
               j = j - 1;
           }
           toSort[j + 1] = key;
       }
    }
}