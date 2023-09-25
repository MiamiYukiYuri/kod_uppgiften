import java.util.Scanner;

public class SalaryArray {
    public static void main(String[] args) {

        System.out.println("Please enter the number of employees that you'd like to pay out salary to.");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();
        int[] employees = new int[arrayLength];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Please enter the salary for employee nr " + (i + 1));
            employees[i] = input.nextInt();
        }

        double tax = 0.30;

        for (int i = 0; i < employees.length; i++) {
            int salary = employees[i];
            double afterTax = (salary * tax);
            int sum = (int) Math.round(salary - afterTax);

            System.out.println("The salary for employee nr " + (i + 1) + " after a tax deduction of 30% is " + sum + " dollars.");
        }
    }
}
