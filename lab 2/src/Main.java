import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of floors");
        int floors=scan.nextInt();
        System.out.println("Number of rooms");
        int rooms = scan.nextInt();
        boolean[][] occupied = new boolean[floors][rooms];
        System.out.println("Welcome to hotel rezervation system");
        initrooms(floors, rooms, occupied);

        while (true) {
            System.out.println("1)Display current floor plan \n2)Book a specific room.\n" +
                    "3)Find the first free room in a given range.\n" +
                    "4)Free an occupied room.\n" +
                    "5)Find three consecutive free rooms.\n" +
                    "6)Show the total number of occupied rooms.\n" +
                    "7)Exit the system. ");



            int i = scan.nextInt();
            if (i == 7) {
                System.out.println("Thank you for using our service");
                System.exit(0);
            }
            switch (i) {
                case 1:
                    printrooms(floors, rooms, occupied);
                    break;
                case 2:
                    bookaroom(floors, rooms, occupied);
                    break;
                case 3:
                    firstfree(rooms,occupied);
                    break;
                case 4:
                    freearoom(floors, rooms, occupied);
                    break;
                case 5:
                    findthree(floors,rooms,occupied);
                    break;
                case 6:
                    occupiedcount(floors,rooms,occupied);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }


    }
    public static void initrooms(int floors,int rooms, boolean[][] occupied){
        Random random = new Random();
        for(int i = 0 ; i<floors;i++){
            for(int j = 0 ; j<rooms;j++){
                occupied[i][j]= random.nextBoolean();
            }
        }
    }
    public static void printrooms(int floors , int rooms ,boolean[][] occupied){
        for(int i = 0 ; i<floors;i++){
            for(int j = 0 ; j<rooms ;j++){
                if(occupied[i][j]==true){
                    System.out.print("O ");
                }
                else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
    public static void bookaroom(int floors , int rooms ,boolean[][] occupied){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter floor number");
        int flr = scan.nextInt();
        System.out.println("Enter room number");
        int room = scan.nextInt();
        if(flr<floors && room<rooms && flr>=0 && room>=0){
            if(occupied[flr-1][room-1]==true){
                occupied[flr-1][room-1]=false;
                System.out.println("Room booked");
            }
            else {
                System.out.println("Room is already occupied");
            }
        }


    }
    public static void freearoom(int floors , int rooms ,boolean[][] occupied){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter floor number");
        int flr = scan.nextInt();
        System.out.println("Enter room number");
        int room = scan.nextInt();
        if(flr<floors && room<rooms && flr>=0 && room>=0){
            if(occupied[flr-1][room-1]==false){
                occupied[flr-1][room-1]=true;
                System.out.println("Room freed");
            }
            else {
                System.out.println("Room is already free");
            }
        }

    }
    public static void firstfree(int rooms ,boolean[][] occupied){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter floor number");
        int flr = scan.nextInt();
        for (int i = flr; i < rooms; i++) {
            if (occupied[flr-1][i-1]) {
                System.out.println("Room"+i+" is available");
            }
        }
    }
    public static void findthree(int floors,int rooms ,boolean[][] occupied){
        for (int j = 0 ; j<floors;j++) {
            for (int i = 0; i < rooms-2; i++) {
            if (occupied[j][i] == true && occupied[j][i+1] == true && occupied[j][i + 2] == true) {
                System.out.println("Floor "+ (j+1) +" Room" + (i+1) + (i + 2) + (i + 3)+" are free ");

            }

        }

        }

    }
    public static void occupiedcount(int floors , int rooms , boolean[][] occupied){
        int count=0;
        for(int i = 0 ; i<floors ; i++){
            for(int j = 0 ; j<rooms; j++){
                if(occupied[i][j]==false){
                    count++;
                }
            }
        }
        System.out.println("there are "+ count+ " occupied rooms");
    }

}





