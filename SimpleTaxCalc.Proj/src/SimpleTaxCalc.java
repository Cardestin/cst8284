
/**
 * simple example using double for calculating with currency
 * @author kriger
 *
 */
public class SimpleTaxCalc {
  /**
 * @param args command line arguments
 */
public static void main(String args[]) {
    double total = 0.70;
    double tax = total * 0.05;
    double taxedTotal = tax + total;

    System.out.printf("Total: %5.2f\n", total);
    System.out.printf("Tax: %5.2f\n", tax);
    System.out.printf("Tax+Total: %5.2f\n", taxedTotal);

      System.out.printf("Actual\n %s \n %s \n %s \n", total, tax, taxedTotal);
  }
}
