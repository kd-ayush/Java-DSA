import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        while(n>0){
            sum = sum + n%10;
            n = n/10;
        }
        sc.close();
        System.out.println("Sum of Digits is: " + sum);
    }
}
