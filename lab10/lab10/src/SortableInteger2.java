public class SortableInteger2 implements Sortable, Comparable<SortableInteger2> {
    private int i;
    public SortableInteger2( int i ) {
        this.i = i;
    }
    public boolean lessThan(SortableInteger2 s) {
        return this.i < s.i;
    }
    @Override
    public int compareTo(SortableInteger2 s) {
        return this.i - s.i;
    }
    @Override
    public String toString() {
        return "" + i;
    }
}