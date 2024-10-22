
import java.util.Scanner;
public class Main{

    public static int menuRepeaterLogic = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        while(menuRepeaterLogic == 0){
            menuRepeaterLogic = 1;
            RunMenu();
        }
    }
    public static void InputData(){
        System.out.println("do you want to submit your hours worked, money earned or gigs completed?");
        String InputDataChoice = sc.nextLine().toUpperCase();

        switch(InputDataChoice){
            default:
                System.out.println("The only valid inputs are hours, money or gigs");
                break;
            case "HOURS":
                System.out.println("How many hours have you worked?");
        }
    }

    public static void Stats(){
        System.out.println("Hello you have chosen Stats");
    }
    public static void WrongInputErrorException(){
        System.out.println("Only valid inputs are inputdata or stats.");
        menuRepeaterLogic = 0;
    }
    public static void RunMenu(){
        System.out.println("would you input data or check stats?");
        String userMenuChoice = sc.nextLine().toUpperCase();

        switch(userMenuChoice){
            case "INPUTDATA" -> InputData();
            case "STATS" -> Stats();
            default -> WrongInputErrorException();
        }

    }
}