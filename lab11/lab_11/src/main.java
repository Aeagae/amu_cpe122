import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        printarraylist(list);
        ArrayList<Integer>intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(1,3);
        printarraylist(intList);
        ArrayList<Double>dList=new ArrayList<>();
        dList.add(3.12);
        printarraylist(dList);
        ArrayList <Integer> dlist = new ArrayList<>();
        dlist.add(2);
        dlist.add(3);
        Marks <Integer> marks = new Marks<>();
        System.out.println(marks.orderAvarage(dlist));
        
    }
    public static<T> void printarraylist(ArrayList <T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    }