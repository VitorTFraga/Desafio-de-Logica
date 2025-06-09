import java.util.Scanner;
import java.util.ArrayList;


public class numerosPRecursivo {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);

        System.out.println("para saber a sequência de primos digite um número: ");
        int number = input.nextInt();

        if (number > 1) {

            ArrayList<Integer> primeNumber = new ArrayList<>();


            recursiveFunction(number, primeNumber, 2);

            System.out.println("os numeros primos entre 1 e " + number + " são: " + primeNumber);
        }else{
            System.out.println("este número não é válido.");
        }

        input.close();
    }

    public static void recursiveFunction(int number, ArrayList<Integer> primeNumber, int divisor){


        if(number <= 1){

            return;
        }
        if (number == 2 || (divisor * divisor > number && number > 1)) {
            
            primeNumber.add(number);
            recursiveFunction(number - 1, primeNumber, 2); 
            return;
        }
        if (number % divisor == 0) {
            
            recursiveFunction(number - 1, primeNumber, 2);
            return;
        }

        recursiveFunction(number, primeNumber, divisor + 1);
    }
}
