import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        int ans = 0;
        for(int i = 0;i<=n;i++){
            if(i%2==0){
                ans = ans-i;
            }
            else{
                ans = ans+i;
            }
        }
        sc.close();
        System.out.println(ans);
    }
}
