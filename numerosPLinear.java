import java.util.Scanner;
import java.util.ArrayList;

public class numerosPLinear {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        System.out.println("para saber a sequência de primos digite um número:  ");
        int number = input.nextInt();

        linearFunction(number);
        input.close();   
    }

    public static void linearFunction(int number){

        ArrayList<Integer> primeList = new ArrayList<>();
        
        if (number > 1) {

            for(int n = 2; n <= number; n++){
                ArrayList<Integer> primeNumber = new ArrayList<>();

                for(int d = 1; d <= n; d++){

                    int prime = n % d;

                    if (prime == 0) {

                        primeNumber.add(d);
                    }
                }
                if (primeNumber.size()== 2) {
                    primeList.add(n);
                }
            }
            
            System.out.println("os números primos entre 1 e "+number + " são: " + primeList);

        }else{
            System.out.println("este número não é válido.");
        }    
    }
}