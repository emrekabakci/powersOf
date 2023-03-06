import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int num;
        System.out.print("Enter a number : ");
        num = inp.nextInt();

        if (num < 0) {
            System.out.print("Please enter a positive numbers : ");
            num = inp.nextInt();
        }

        System.out.println("Powers of 4");
        for (int i = 1; i <= num; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5");
        for (int i = 1; i <= num; i *= 5) {
            System.out.println(i);
        }
    }
}
