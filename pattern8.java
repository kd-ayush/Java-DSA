import java.util.Scanner;
/*
        121212
        212121
        121212
        212121
 */
public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int row = sc.nextInt();
        System.out.print("Enter no. of columns:");
        int col = sc.nextInt();
        for(int i= 1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("2");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
