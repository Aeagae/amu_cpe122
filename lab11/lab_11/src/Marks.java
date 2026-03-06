import java.util.ArrayList;
public class Marks <M extends Number>{
    public double orderAvarage (ArrayList<M> list){
        double sum = 0.0 ;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).doubleValue();
        }
        return sum/list.size();
    }
    public static void main(String[] args) {
        ArrayList <Integer> dlist = new ArrayList<>();
        dlist.add(2);
        dlist.add(3);
        Marks <Integer> marks = new Marks<>();
        System.out.println(marks.orderAvarage(dlist));
    }
}

