import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int accountBalance = 800;
        System.out.println("The current balance of your account is " + accountBalance + " dollars.");
        System.out.println("Please enter the total sum of the invoice that you want to create.");

        int userInput = input.nextInt();
        double totalSumInvoice = userInput * 0.25;
        int sum = (int) Math.round(totalSumInvoice);
        System.out.println("The sales tax for your invoice is " + sum + " dollars.");

        System.out.println("The total sum of your account balance and the invoice you want to create is " + (accountBalance + userInput) + " dollars.");
        System.out.println("The gross total for your invoice is " + userInput + " dollars.");
        System.out.println("The total sum of sales tax is " + sum + " dollars.");
        System.out.println("The net sum of your invoice is " + (userInput - sum) + " dollars");
    }
}