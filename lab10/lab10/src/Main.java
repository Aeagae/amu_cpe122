public class Main {
    public static void main(String[] args)  {
        Song s1 = new Song("Bombalar","Soft Analog");
        s1.play();
        s1.pause();
        EBook e = new EBook("Madonna", 3.0);
        e.download();
        e.read();
        SortableInteger2[] arr = {
            new SortableInteger2(5),
            new SortableInteger2(2),
            new SortableInteger2(8),
            new SortableInteger2(1)
        };
        Sorter.sort(arr);
        //Sorter.sort2(arr);
        for (SortableInteger2 i: arr) {
            System.out.print(i + " ");
        }
    }
}