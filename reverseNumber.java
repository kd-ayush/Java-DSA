import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int n = num;
        int ans=0;
        while(n>0){
            ans =(ans*10 + n%10);
            n/=10;
        }
        sc.close();
        System.out.println(ans);

    }
}
