import java.util.Scanner;
class leapornot{
 
    public static void main(String[] args) {
     int year;
    	Scanner scan = new Scanner(System.in);
    
    	year = scan.nextInt();
        
        if(year%400==0)
        {
            System.out.println("Leap Year");
        }
        else if(year%4==0 && year%100!=0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
      
    }
}
