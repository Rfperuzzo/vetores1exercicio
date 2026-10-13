
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int x[] = new int[20] , i , soma = 0 ;
        double  media ;
        
        for(i = 0 ; i < 20 ; i++){
            System.out.println("Digite um número: ");
            x[i] = scanner.nextInt();
            soma = x[i] + soma;
        }
        media = soma / 20.0 ;
        System.out.println(media);
        System.out.println(soma);
        
    }
}
