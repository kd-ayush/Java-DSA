import java.util.Scanner;

/*   
    ******
     ******
     ******
 */


public class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r= sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int c= sc.nextInt();

        for(int i =0;i<r;i++){
            for(int j =0;j<c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
