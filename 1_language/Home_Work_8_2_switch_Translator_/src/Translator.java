
import java.util.Scanner;


public class Translator {

    public static void main(String[] args) {


            String[] day = new String[]{"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Cуббота", "Воскресения", "q"};
            System.out.println("Enter day:\n");
            Scanner scan = new Scanner(System.in);
            for (int i = 0; i < day.length; i++) {
                day[i] = scan.nextLine();
                switch (day[i]) {
                    case "Monday":
                        System.out.println("Понедельник");
                        break;
                    case "Tuesday":
                        System.out.println("Вторник");
                        break;
                    case "Wednesday":
                        System.out.println("Среда");
                        break;
                    case "Thursday":
                        System.out.println("Четверг");
                        break;
                    case "Friday":
                        System.out.println("Пятница");
                        break;
                    case "Saturday":
                        System.out.println("Cуббота");
                        break;
                    case "Sunday":
                        System.out.println("Воскресения");
                        break;
                    case "q" :
                       return;
                }
            }
        }


}
