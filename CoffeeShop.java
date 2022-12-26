import java.util.Scanner;
public class CoffeeShop{
    public static void main(String[] args){
        while(true){
        Scanner sc = new Scanner(System.in);
        // ask for user balance
        // ask user for coffee type
        // ask user for quantity
        // if user inputs 0 or negative number, produce no output
        // the user should get a different message depending on what type of coffee purchsed

        System.out.println("what is your balance");
        String balanceInput = sc.nextLine();
        double balance = Double.parseDouble(balanceInput);
        System.out.println("what type of coffee do you want?");
        String coffeeInput = sc.nextLine();
        System.out.println("How many do you want?");
        int qtyInput = Integer.parseInt(sc.nextLine());
        double expressoPrice = 3.99;
        double americanoPrice = 4.99;

        if(qtyInput > 0){
            //proceed with coffee purchase
            boolean isExpresso = coffeeInput.equalsIgnoreCase("expresso");
            boolean isAmericano = coffeeInput.equalsIgnoreCase("americano");
            if(isExpresso && (balance >= (expressoPrice * qtyInput))){
                // print out a successful transaction message
                System.out.println("enjoy your expresso");
            }
            if(isAmericano && (balance >= (americanoPrice * qtyInput))){
                 // print out a successful transaction message
                 System.out.println("enjoy your americano");

            }
        }else{
            System.out.println("no coffee - amount ordered is 0 or less");
        }
        // no coffee
        // test git push

    }
    
}

}