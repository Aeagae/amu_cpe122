import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        arr();
       // avarage();
    }
    public static void arr(){
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[100];
        for (int i = 0 ; i<arr.length ; i++){
            arr[i]= (int) (Math.random()*100);
        }
        try {
            System.out.println("Enter an index: ");
            int index = scan.nextInt();
            if(index<=0||index>=arr.length){
            throw new ArrayIndexOutOfBoundsException("index out of bounds");
         }
            else{
            System.out.println(index +" " +arr[index]);
            }
            } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void avarage(){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter number of integers : ");
            int n = scan.nextInt();
            if (n <= 0) {
                throw new IllegalArgumentException("N need to be positive");
            }
            int[] numbers = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                while (true) {
                    try {
                        System.out.print("Enter integer at index " + i + " : ");
                        numbers[i] = scan.nextInt();
                        sum += numbers[i];
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input");
                    }
                }
            }
            System.out.println("Average: " + ((double) sum / n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    }

