import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N;
        int T = 0;
        for(int i = 0; i < 6; i++) {
            N = sc.nextDouble();
            if(N > 0) T++;
        }
        System.out.println(T + " valores positivos");
        sc.close();
    }
}