import java.util.Scanner;
/*
        123456
        123456
        123456
        123456
 */
public class pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns:");
        int col = sc.nextInt();

        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=col;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
