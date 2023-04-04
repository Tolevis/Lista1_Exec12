import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        double h, pesoIdeal;
        System.out.print("Digite a sua Altura: ");
        h = entrada.nextDouble();
    
        pesoIdeal = (72.7 * h) - 58;
        System.out.println("Peso ideal: "+ pesoIdeal);
        entrada.close();
    }   
}    