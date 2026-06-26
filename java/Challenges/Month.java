import java.util.Scanner;

class Month{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your month number");
        int monthnum = sc.nextInt();
        String monthName = getMonthName(monthnum);
        System.out.println("your month name is:" + monthName);
        
    }
    public static String getMonthName (int monthnum) {
        return switch(monthnum){
            case 1->"january";
             case 2->"feb";
             case 3->"march";
             case 4->"april";
             case 5->"may";
             case 6->"june";
             case 7->"july";
             case 8->"august";
             case 9->"sep";
             case 10->"oct";
             case 11->"nov";
             case 12->"dec";
            
            default ->"invalid month";
        };
    }
}