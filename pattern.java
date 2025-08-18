import java.util.*;
public class pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b && b<c){
            System.out.println("The numbers are in increasing order.");
        } else if(a>b && b>c){
            System.out.println("The numbers are in decreasing order.");
        } else if(b>a && b>c){
            System.out.println("Middle number is the largest.");
        }
    }
    
}