import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to be checked: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.print("Even Number!");
        }
        else{
            System.out.print("Odd Number!");
        }
    }
}
