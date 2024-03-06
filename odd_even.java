import java.util.Scanner;

class odd_even{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = sc.nextInt();
        if(num%2 != 0){
            System.out.println("Number is Odd" + " "+ num);
        }
        else{
            System.out.println("Number is Even" + " " + num);
        }
        sc.close();
    }
}