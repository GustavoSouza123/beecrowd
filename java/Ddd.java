import java.util.Scanner;

public class Ddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        sc.close();
        if(D == 61) {
            System.out.println("Brasilia");
        } else if(D == 71) {
            System.out.println("Salvador");
        } else if(D == 11) {
            System.out.println("Sao Paulo");
        } else if(D == 21) {
            System.out.println("Rio de Janeiro");
        } else if(D == 32) {
            System.out.println("Juiz de Fora");
        } else if(D == 19) {
            System.out.println("Campinas");
        } else if(D == 27) {
            System.out.println("Vitoria");
        } else if(D == 31) {
            System.out.println("Belo Horizonte");
        } else {
            System.out.println("DDD nao cadastrado");
        }
    }
}