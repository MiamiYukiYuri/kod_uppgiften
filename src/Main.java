// importerar scannerklassen för att kunna ta in användarens input
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // initierar och hämtar min menymetod
        // eftersom jag använder menyn flera gånger i koden valde jag att göra det till en metod
        Menu menu = new Menu();
        System.out.println("Welcome!");
        menu.methodMenu();

        // variabler som är vara konstanta under hela programmets gång
        int accountBalance = 1600;
        int arrayLength = 0;
        boolean running = true;

        // while-loop för menyval 4 med boolean running satt till true, vilket innebär att loopen kommer köra så länge running inte är = false
        // ny skanner, input, och ny variabel för att ta emot användarens input; inputFromUser
        while (running) {
            Scanner input = new Scanner(System.in);
            String inputFromUser = input.nextLine();

            // switchen motsvarar valen i menyn ovan, ett case för varje val
            // switchen går igenom alla case för att se om användarens input matchar något av alternativen
            switch (inputFromUser) {
                case "1":

                    // ny ny array, employees, av datatypen integer vars indexstorlek skall motsvara användarens input
                    // ny variabel av datatypen double för att kunna räkna på skatt
                    System.out.println("Please enter the number of employees that you would like to pay out salary to.");
                    System.out.print("Input: ");
                    arrayLength = input.nextInt();
                    int[] employees = new int[arrayLength];
                    double tax = 0.30;

                    // for-loop som kommer itereras för varje indexplats i arrayen, baserat på användarens tidigare input
                    // för varje indexplats/"anställd" så behöver användaren mata in lön
                    for (int i = 0; i < employees.length; i++) {
                        System.out.println("Please enter the salary for employee nr " + (i + 1));
                        System.out.print("Input: ");
                        employees[i] = input.nextInt();
                    }

                    // ny variabel salary av datatypen integer som hämtar värdet för lön för respektive index/"anställd" i arrayen employees.
                    // ny variabel afterTax av datatypen double för uträkning av lön efter skatt
                    // ny variabel sum av datatypen integer som rundar av värdet av afterTax
                    // kallar på metoden för välkomstmenyn om användaren vill göra ytterligare val

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

                    // efterfrågar input i fråga om antal fakturor som skall skapas
                    // ny variabel av datatypen double, totalSumInvoice, för att räkna ut totala kostnaden samt kostnaden för moms
                    // ny variabel av datatypen integer, sum, för att runda av beloppet för den totala fakturan

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
                    // nya variabler av datatypen integer för att använda vid uträkning av kontosaldo och fakturor
                    int invoiceTotal = 0;
                    int totalBalance = 0;

                    // ny array, invoices, av datatypen integer vars indexstorlek skall motsvara användarens input
                    System.out.println("Please enter the number of invoices you would like to pay.");
                    System.out.print("Input: ");
                    arrayLength = input.nextInt();
                    int[] invoices = new int[arrayLength];

                    // for loop för arrayen invoices som kommer loopas igenom för varje indexplats, vilket motsvaras av användarens input
                    // för varje indexplats/"faktura" så behöver användaren mata in belopp för densamma
                    for (int i = 0; i < invoices.length; i++) {
                        System.out.println("Please enter the cost of invoice nr " + (i + 1));
                        System.out.print("Input: ");
                        invoices[i] = input.nextInt();
                    }

                    // for loop som adderar värdet som användaren matar in för varje iteration till ett gemensamt värde, invoiceTotal.
                    // uträkningar för fakturans totalbelopp samt kontosaldo efter betald faktura
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

                    // om input är 4 avslutas programmet då boolean running sätts till false i while-loopen
                    System.out.println("Goodbye!");
                    running = false;
                    break;

                    // sista delen i switchen, default fångar upp felaktig/ogiltig input från användaren eller input som inte matchar något alternativ i switchen
                default:
                    System.out.println("Not valid input. Please enter a valid choice from the menu.");
            }
        }
    }
}