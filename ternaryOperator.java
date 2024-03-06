import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        String ans;
        ans=(num%2 == 0) ?"Even":"Odd";
        System.out.println(ans);
        sc.close();
    }
    
}
