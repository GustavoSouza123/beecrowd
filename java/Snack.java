import java.util.Scanner;

public class Snack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        double total = 0;
        if(X == 1) total = 4 * Y;
        else if(X == 2) total = 4.5 * Y;
        else if(X == 3) total = 5 * Y;
        else if(X == 4) total = 2 * Y;
        else if(X == 5) total = 1.5 * Y;
        System.out.printf("Total: R$ %.2f", total);
        System.out.println();
    }
}