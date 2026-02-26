import java.util.Scanner;
public class lab3 {
    public static void main(String[] args) {
        System.out.println("Give size of an array");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        /*int arr [] = new int[a];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }*/
        int arrrandm []=new int[a];
        for (int i = 0 ; i<a ; i++ ){
            arrrandm[i]= (int) (Math.random()*100);
        }
        printArray(arrrandm);
        bubblesort(arrrandm);
        printArray(arrrandm);
        System.out.println("choose target");
        int target = scan.nextInt();
        System.out.println(binarySearch(arrrandm , target));
        //selectionSortasc(arrrandm);
        //selectionSortdes(arrrandm);
        printArray(arrrandm);
        testTriangle();


    }
    public static void bubblesort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   int k=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = k;
                }
            }
        }
    }
    public static int binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = (high+low)/2;
            if (array[mid] == target){
                return mid;
            }
            else if (array[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void selectionSortasc(int[] array){
    for (int j = 0 ; j < array.length-1 ; j++) {
        int min = j;
        for (int i = j+1; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        int k = array[min];
        array[min] = array[j];
        array[j] = k;
    }
    }
    public static void selectionSortdes(int[] array){
    for (int j = 0 ; j < array.length-1 ; j++) {
        int max = j;
        for (int i = j + 1 ; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        int k = array[max];
        array[max] = array[j];
        array[j] = k;
    }
    }
    public static void printArray(int[]array){
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
        }
    System.out.println();
    }
    public static void testTriangle(){
    Triangle t1 = new Triangle();
    System.out.println(t1);
    Triangle t2 = new Triangle(2,3);
    System.out.println(t2);
    Triangle t3 = new Triangle();
    System.out.println("t1 = t3 ?"+t1.equals(t3));
    t2.tripleBase();
    System.out.println(t2+ " area : " +t2.Area());
    t1.setBase(3);
    t1.setHeight(5);
    System.out.println( "base " +t1.getBase()+" height "+ t1.getHeight());
    }
    }


