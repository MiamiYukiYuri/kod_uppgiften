import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        System.out.println("Welcome!");
        menu.methodMenu();

        int accountBalance = 1600;
        int arrayLength = 0;
        boolean running = true;

        while (running) {
            Scanner input = new Scanner(System.in);
            String inputFromUser = input.nextLine();

            switch (inputFromUser) {
                case "1":                  
                    System.out.println("Please enter the number of employees that you would like to pay out salary to.");
                    System.out.print("Input: ");
                    arrayLength = input.nextInt();
                    int[] employees = new int[arrayLength];
                    double tax = 0.30;

                    for (int i = 0; i < employees.length; i++) {
                        System.out.println("Please enter the salary for employee nr " + (i + 1));
                        System.out.print("Input: ");
                        employees[i] = input.nextInt();
                    }
                    System.out.println(" ");
                    for (int i = 0; i < employees.length; i++) {
                        int salary = employees[i];
                        double afterTax = (salary * tax);
                        int sum = (int) Math.round(salary - afterTax);

                        System.out.println("The salary for employee nr " + (i + 1) + " after a tax deduction of 30% is " + sum + " dollars.");
                    }
                    menu.methodMenu();
                    break;

                case "2":
                    System.out.println("The current balance on your account is " + accountBalance + " dollars.");
                    System.out.println("Please enter the total sum of the invoice that you want to create.");
                    System.out.print("Input: ");

                    int userInput = input.nextInt();
                    double totalSumInvoice = userInput * 0.25;
                    int sum = (int) Math.round(totalSumInvoice);
                    System.out.println();

                    System.out.println("The total sum of your account balance and the invoice you want to create is " + (accountBalance + userInput) + " dollars.");
                    System.out.println("The gross total for your invoice is " + userInput + " dollars.");
                    System.out.println("The total sum of sales tax is " + sum + " dollars.");
                    System.out.println("The net sum of your invoice is " + (userInput - sum) + " dollars.");
                    menu.methodMenu();
                    break;

                case "3":
                    int invoiceTotal = 0;
                    int totalBalance = 0;

                    System.out.println("Please enter the number of invoices you would like to pay.");
                    System.out.print("Input: ");
                    arrayLength = input.nextInt();
                    int[] invoices = new int[arrayLength];

                    for (int i = 0; i < invoices.length; i++) {
                        System.out.println("Please enter the cost of invoice nr " + (i + 1));
                        System.out.print("Input: ");
                        invoices[i] = input.nextInt();
                    }

                    for (int i = 0; i < invoices.length; i++) {
                        invoiceTotal += invoices[i];
                    }
                    System.out.println("");
                    System.out.println("The total sum of your invoices is " + invoiceTotal + " dollars.");

                    totalBalance = (accountBalance - invoiceTotal);
                    System.out.println("Your account balance will be " + (totalBalance) + " dollars after your invoices has been paid.");
                    menu.methodMenu();
                    break;
                case "4":
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Not valid input. Please enter a valid choice from the menu.");
            }
        }
    }
}