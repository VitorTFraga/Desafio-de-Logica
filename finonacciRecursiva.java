import java.util.Scanner;

public class finonacciRecursiva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("digite um número para saber a sequência de fibonacci correspondente: ");
        int number = input.nextInt();

        if (number >= 0) {
            
            System.out.println("fib("+number+") = " + fibonacci(number));
        }else{

            System.out.println("este número não é válido.");
        }

        input.close();
    }


    public static int fibonacci(int number){


        if (number == 0) {
     
            return 0;
        }

        if (number ==1) {
        
            return 1;
        }
        return fibonacci(number - 1 ) + fibonacci(number - 2);
        
    }
}
