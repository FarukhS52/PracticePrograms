import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        long userInput = sc.nextInt();

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        System.out.println("Factorial of the given no. is:" +factorialCalculator.factorialCalculator(userInput));
    }
    public long factorialCalculator(long userInput){
        long factorial = 1;
        for(long j=1; j<=userInput;j++)
        {
            factorial = factorial*j ;
        }
        return factorial;
    }
}
