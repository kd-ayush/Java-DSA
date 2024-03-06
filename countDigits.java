import java.util.Scanner;

public class countDigits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int count=0;
        int n = num;
        while (n>0) {
            n = n/10;
            count++;
        }
        sc.close();
        System.out.println("Number of digits in" +" " + num + " is "+ count);
    }
}