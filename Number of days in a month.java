import java.util.Scanner;
public class Months 
{
    public static void main(String[] strings) 
    {
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth=0; 
        String MonthName="Unknown";
        System.out.print("Input a Month Number: ");
        int month = input.nextInt();
        System.out.print("Input a Year: ");
        int year = input.nextInt();
        switch (month) {
            case 1:
                MonthName = "January";
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                MonthName = "March";
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                MonthName = "April";
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                MonthName = "May";
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                MonthName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                MonthName = "July";
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                MonthName = "August";
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                MonthName = "September";
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                MonthName = "October";
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                MonthName = "November";
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                MonthName = "December";
                number_Of_DaysInMonth = 31;
        }
        System.out.print(MonthName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}
