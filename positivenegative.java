import java.util.Scanner;
class positivenegative
{
    public static void main(String[] args) 
    {
    
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();
       
        if(number > 0)
        {
            System.out.println("Positive");
        }
        else if(number < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
