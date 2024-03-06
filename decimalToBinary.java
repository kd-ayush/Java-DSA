import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decinal no. of :");
        int num = sc.nextInt();
        int sum = 0;
        int pow10 = 1;
        int n = num;

        while(n>0){
            int parity = n%2;
            sum = sum + (parity*pow10);
            pow10 *=10;
            n = n/2;
        }
        System.out.println(sum);
        sc.close();
    }
}
