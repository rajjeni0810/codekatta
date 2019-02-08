import java.util.Scanner;
class PrintName
{
    public static void main(String args[]){
         
        int loop; 
         Scanner input = new Scanner(System.in);
           int n;
          n= input.nextInt();
      
        final String name="Hello"; 
         
        loop=1; 
        while(loop<=n){
            System.out.println(name);
            loop++; 
        }
         
    }
}
