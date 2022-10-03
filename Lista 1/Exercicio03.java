import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        String name;
        double salariofixo,salfinal, vendas;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Nome: ");
        name = sc.nextLine();
        System.out.println("Salário fixo: ");
        salariofixo = sc.nextDouble();
        System.out.println("Venda: ");
        vendas = sc.nextDouble();

        salfinal = salariofixo + (vendas*0.15);

        System.out.printf("Total: %.2f%n", salfinal);


    }
}
