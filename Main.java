import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("The first one");
        a = sc.nextInt();
 
        System.out.println("The second one");
        b = sc.nextInt();
        System.out.println(sum(a,b));
        System.out.println(subtr(a,b));
        System.out.println(mult(a,b));
    }
		
    public static int sum(int a, int b) {
         return a+b;
    }

}
