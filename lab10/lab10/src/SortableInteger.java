public class SortableInteger implements Comparable<SortableInteger> {
    private int i;
    public SortableInteger( int i ) {
        this.i = i;
    }
    @Override
    public int compareTo(SortableInteger s) {
        return this.i - s.i;
    }
    @Override
    public String toString() {
        return "" + i;
    }
}
