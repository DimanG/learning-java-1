import java.util.Scanner;

public class Day {

    public static void main(String[] args) {

    String[] day = new String[]{"1", "2", "3", "4", "5", "6", "7"};
    System.out.println("Enter № day:\n");
    Scanner scan = new Scanner(System.in);
         for (int i = 0; i < day.length; i++) {
              day[i] = scan.nextLine();
              switch (day[i]) {
                   case "1":
                      System.out.println("Monday");
                       break;
                   case "2":
                        System.out.println("Tuesday");
                       break;
                   case "3":
                        System.out.println("Wednesday");
                        break;
                   case "4":
                        System.out.println("Thursday");
                        break;
                   case "5":
                        System.out.println("Friday");
                         break;
                   case "6":
                        System.out.println("Thursday");
                        break;
                   case "7":
                         System.out.println("Sunday");
                         break;
                   default:
                       System.out.println("Introduced the day does not exist");
                       return;
                    }
                }
            }
        }
