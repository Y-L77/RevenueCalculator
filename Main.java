
import java.util.Scanner;
public class Main{
    

    public static int menuRepeaterLogic = 0;
    public static int InputDataRepeaterLogic = 1;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
        while(menuRepeaterLogic == 0){
            menuRepeaterLogic = 1;
            RunMenu();
        }
    }
    public static void InputData(){
        while(InputDataRepeaterLogic == 0){
            InputDataRepeaterLogic = 1;
            System.out.println("do you want to submit your hours worked, money earned or gigs completed?");
            String InputDataChoice = sc.nextLine().toUpperCase();
    
            switch(InputDataChoice){
                default:
                    System.out.println("The only valid inputs are hours, money or gigs");
                    InputDataRepeaterLogic = 0;
                    break;
                case "HOURS":
                    System.out.println("How many hours have you worked?");
                    double amount = sc.nextDouble();
                    StoredData.addHours(amount);
                    
            }
        }
    }

    public static void Stats(){
        System.out.println("Hello you have chosen Stats"); //work on later
        //temp for testing, delete me later!
        StoredData.getHours();
    }
    public static void WrongInputErrorException(){
        System.out.println("Only valid inputs are inputdata or stats.");
        menuRepeaterLogic = 0;
    }
    public static void RunMenu(){
        System.out.println("would you like to input data or check stats?");
        String userMenuChoice = sc.nextLine().toUpperCase();

        switch(userMenuChoice){
            default: 
            WrongInputErrorException();
            break;
            case "INPUTDATA":
                InputDataRepeaterLogic = 0;
                break;
            case "STATS":
                Stats();
                break;


            /*case "INPUTDATA" -> InputData();
            case "STATS" -> Stats();
            default -> WrongInputErrorException(); 
            */
            //This is blurred out because I'm using my linux laptop and I'm using JAVA 11 instead of JAVA 21 or 14+ which doesn't support arrow cases
        }

    }
}