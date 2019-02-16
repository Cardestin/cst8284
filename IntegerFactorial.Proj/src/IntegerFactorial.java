/**
 * example implementing factorial with Integer
 * @author kriger
 */
public class IntegerFactorial {
    /**
     * @param args commend line arguments
     */
    public static void main(String[] args) {

        Integer fact6, fact49;

        fact6=Factorial(6);
        fact49=Factorial(49);

        System.out.printf("fact(6) = %d%n", fact6);
        System.out.printf("fact(49) = %d%n", fact49);
    }

    static Integer Factorial(Integer f) {
        Integer product = new Integer("1");

        for(int i=2; i<=f; i++) {
//            System.out.printf("Muliplying by: %s%n", i);
            Integer temp=new Integer(i);
            product=product*temp;
//            System.out.printf("\tresulting product: %s%n", product);
        }
        return product;
    }
}
