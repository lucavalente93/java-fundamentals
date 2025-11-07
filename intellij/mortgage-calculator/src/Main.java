import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
// Note: This program requires Java 25 or newer.
// For Java 24 or earlier, use the standard entry point:
// public static void main(String[] args) {}

void main() {
    // Principal
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Principal:");
    double principal = scanner.nextDouble();
    System.out.println("$" + principal);

    // Annual interest rate
    System.out.println("Insert your annual interest rate (in %):");
    double annualRate = scanner.nextDouble() / PERCENT; // decimal conversion

    // Monthly interest rate
    System.out.println("Monthly interest rate:");
    double monthlyInterest = (annualRate / MONTHS_IN_YEAR);

    // Annual and Monthly payments
    System.out.println("Period (in years): ");
    int years = scanner.nextInt();
    int totalPayments = years * MONTHS_IN_YEAR;

    double mortgage = principal
            * (monthlyInterest * Math.pow(1 + monthlyInterest, totalPayments))
            / (Math.pow(1 + monthlyInterest, totalPayments) - 1);
    System.out.println("Mortgage: " + Math.round(mortgage));

//     Currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        String mortgageFormatted = currency.format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
}