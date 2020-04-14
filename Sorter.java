import java.lang.Comparable;

public interface Sorter<T extends Comparable<T>> {
    public void sort(T[] toSort);
}