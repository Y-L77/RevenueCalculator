
import java.util.Scanner;
public class Main{
    

    public static boolean menuRepeaterLogic = true;
    public static boolean InputDataRepeaterLogic = false;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        while(menuRepeaterLogic){
            menuRepeaterLogic = false;
            RunMenu();
        }
    }
    public static void InputData(){
        while(InputDataRepeaterLogic){
            System.out.println("do you want to submit your hours worked, money earned, gigs completed, or go back?");
            String InputDataChoice = sc.nextLine().toUpperCase();
    
            switch(InputDataChoice){
                default:
                    System.out.println("The only valid inputs are hours, money, gigs or back");
                    break;
                case "HOURS":
                    System.out.println("How many hours have you worked?");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    StoredData.addHours(amount);
                    System.out.println("Added " + amount + " To your hours worked! your total hours is now at " + StoredData.getHours() + "!");
                    break;
                case "BACK":
                    InputDataRepeaterLogic = false;
                    RunMenu();

                    
            }
        }
    }

    public static void Stats(){
        System.out.println("Hello you have chosen Stats"); //work on later
        //temp for testing, delete me later!
        StoredData.getHours();
    }
    public static void WrongInputErrorException(){
        System.out.println("Only valid inputs are inputdata, stats or exit.");
        menuRepeaterLogic = true;
        RunMenu();
    }
    public static void RunMenu(){
        System.out.println("would you like to input data, check stats, or exit the program?");
        String userMenuChoice = sc.nextLine().toUpperCase();

        switch(userMenuChoice){
            default: 
            WrongInputErrorException();
            break;
            case "INPUTDATA":
                InputDataRepeaterLogic = true;
                InputData();
                break;
            case "STATS":
                Stats();
                break;
            case "EXIT":
                System.out.println("You've exited the program :(");
                System.exit(0);
                break;



            /*case "INPUTDATA" -> InputData();
            case "STATS" -> Stats();
            default -> WrongInputErrorException(); 
            */
            //This is blurred out because I'm using my linux laptop and I'm using JAVA 11 instead of JAVA 21 or 14+ which doesn't support arrow cases
        }

    }
}