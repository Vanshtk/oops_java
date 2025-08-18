import java.util.*;
public class meter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length in meters:");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
    }
    
    
}