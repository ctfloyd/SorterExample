import java.lang.Comparable;

public class SelectionSorter<T extends Comparable<T>> implements Sorter<T> {

    @Override
    public void sort(T[] toSort) {
         throw new RuntimeException("Unimplemented");
    }
}