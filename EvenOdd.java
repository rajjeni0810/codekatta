import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);

        int num = input.nextInt();

        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
