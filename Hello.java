import java.util.Scanner;
public class Hello{
    //test git push
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int number = sc.nextInt();
        if(number >= 0){
            System.out.println("Your input is positive! ");
        }else if(number < 0){
            System.out.println("Your input is negative!");
        }
        
        System.out.println("Your input is " + number);
        sc.close();

    }
    
}