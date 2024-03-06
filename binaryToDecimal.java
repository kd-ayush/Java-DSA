import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. in binary form:");
        int num = sc.nextInt();
        int sum = 0;
        int n = num;
        int powerOf2 = 1;

        while(n>0){
            int unitDigit = n%10;
            sum = sum+(unitDigit*powerOf2);
            n = n/10;
            powerOf2 *= 2;
        }
        System.out.println("Binary no. in Decinal from is:" + sum);
        sc.close();
    }
}
