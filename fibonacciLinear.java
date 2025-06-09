import java.util.Scanner;


public class fibonacciLinear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        

        System.out.println("digite um número para saber a sequência de fibonacci correspondente: ");
        int number = input.nextInt();

        fibonacci(number);
        input.close();  
    }

    public static void fibonacci(int number){

        int n = 0;
        int index = 1;
        if (number >= 0) {
            
            if(number == 0){

                System.out.println("fib("+number+") = " + n);
            }else if(number == 1 || number == 2){
                n = 1;
                System.out.println("fib("+number+") = " + n);
            }else{

                n = 1;
                int x = 0;
                int a;
                while (index < number) {

                    a = n;
                    n += x;
                    x = a;
                    index++;
                }
                System.out.println("fib("+number+") = " + n);
            }
        }else{

            System.out.println("este número não é válido.");
        }
    }
}
