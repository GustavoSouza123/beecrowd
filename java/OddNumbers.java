import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        for(int i = 1; i <= X; i++) {
            if(i % 2 == 1) System.out.println(i);
        }
    }
}