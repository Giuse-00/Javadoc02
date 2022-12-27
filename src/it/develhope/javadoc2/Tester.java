package it.develhope.javadoc2;

/**
 * @author Giuseppe Iacono
 * class Tester
 */
public class Tester {

    public static void main(String[] args) {

        ArithmeticOperators maths = new ArithmeticOperators();

        System.out.println("The sum is: " + maths.sum(4,6));
        System.out.println("The difference is: " + maths.sub(8,2));
        System.out.println("The multiplication is: " + maths.mul(7,2));
        System.out.println("The division is: " + maths.div(4,2));

    }
}
