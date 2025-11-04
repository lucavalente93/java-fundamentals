import java.util.Scanner;
// Note: This program requires Java 25 or newer.
// For Java 24 or earlier, use the standard entry point:
// public static void main(String[] args) {}
void main() {
//    NumberFormat currency = NumberFormat.getCurrencyInstance();

    // Principal
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Principal:");
    double principal = sc1.nextDouble();
    System.out.println("$" + principal);

    // Annual interest rate
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Insert your annual interest rate (in %):");
    double annualRate = sc2.nextDouble() / 100; // decimal conversion

    // Monthly interest rate
    System.out.print("Monthly interest rate:");
    double monthlyRate = (annualRate / 12);

    // Annual and Monthly payments
    Scanner sc3 = new Scanner(System.in);
    System.out.println("Period (in years): ");
    int years = sc3.nextInt();
    int totalPayments = years * 12; // months conversion

    double mortgage = principal
            * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) / (Math.pow(1 + monthlyRate, totalPayments) - 1);
    System.out.println("Monthly payment: $" + Math.round(mortgage));
}
