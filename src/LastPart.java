import java.util.Scanner;

public class LastPart {
    public static void main(String[] args) {

        int invoiceTotal = 0;
        int totalBalance = 0;
        int accountBalance = 1600;

        System.out.println("Please enter the number of invoices you would like to pay.");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] invoices = new int[arrayLength];

        for (int i = 0; i < invoices.length; i++) {
            System.out.println("Please enter the cost of invoice nr " + (i + 1));
            invoices[i] = input.nextInt();
        }

        for (int i = 0; i < invoices.length; i++) {
            invoiceTotal += invoices[i];
        }   // += gör att värdet av invoice input plussas på för varje loop
        System.out.println("The total sum of your invoices is " + invoiceTotal);

        totalBalance = (accountBalance - invoiceTotal);
        System.out.println("Your account balance will be " + (totalBalance) + " after your invoices has been paid.");
    }
}