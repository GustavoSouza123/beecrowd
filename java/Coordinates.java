import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();
        
        String out = "";
        if(x == 0 && y == 0) out = "Origem";
        else if(x == 0) out = "Eixo Y";
        else if(y == 0) out = "Eixo X";
        else if(x > 0 && y > 0) out = "Q1";
        else if(x < 0 && y < 0) out = "Q3";
        else if(x > 0 && y < 0) out = "Q4";
        else if(x < 0 && y > 0) out = "Q2";

        System.out.println(out);
    }
}