package homework.QuadraticEquation;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Chương trình giải phương trình bậc 2: ax*x + bx + c = 0.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập vào c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("Phương trình không có nghiệm");
        } else {
            System.out.println("nghiệm 1 = " + quadraticEquation.getRoot1());
            System.out.println("nghiệm 2 = " + quadraticEquation.getRoot2());
        }
    }
}
