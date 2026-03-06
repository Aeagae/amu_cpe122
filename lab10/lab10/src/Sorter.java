public class Sorter  {
    public static void sort( Comparable[] arr ) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    Comparable c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }
    }
    public static void sort2 (Sortable [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                    Sortable s = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = s;
                }
            }
    }
}
