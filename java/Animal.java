import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String input3 = sc.nextLine();
        sc.close();

        if(input1.equals("vertebrado")) {
            if(input2.equals("ave")) {
                if(input3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else if(input3.equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if(input2.equals("mamifero")) {
                if(input3.equals("onivoro")) {
                    System.out.println("homem");
                } else if(input3.equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }
        } else if(input1.equals("invertebrado")) {
            if(input2.equals("inseto")) {
                if(input3.equals("hematofago")) {
                    System.out.println("pulga");
                } else if(input3.equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if(input2.equals("anelideo")) {
                if(input3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if(input3.equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}