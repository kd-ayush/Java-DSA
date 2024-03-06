import java.util.Scanner;
/*
        1234567
        2345671
        3456712
        4567123
        6712345
        7123456
 */
public class pattern6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int row = sc.nextInt();
        for(int i = 1;i<=row;i++){
            for(int j = i;j<=row;j++){
                System.out.print(j);
            }
            for(int j = 1;j<=i-1;j++){
                System.out.print(j);
            }
            System.out.println();
        } 
        sc.close();
    }
}
