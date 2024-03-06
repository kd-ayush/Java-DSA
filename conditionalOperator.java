import java.util.Scanner;

public class conditionalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        // if(num%2 == 0 && num%3 == 0){
        //     System.out.println("Number is even and divisible by 3");
        // }
        // else{
        //     System.out.println("Number is not even and not divisible by 3");
        // }

        if(num%3==0 || num%5==0){
            System.out.println("Number is divisible by 3 or 5");
        }
        else{
            System.out.println("Number is not divisible by 3 or 5");
        }
        sc.close();
    }
    
}
