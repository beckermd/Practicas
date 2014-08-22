/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/7/14
 * Time: 11:00 AM
 * To change this template use File | Settings | File Templates.
 * Change for a Dollar (onsite: needs code)
 * Write a method to determine how many different ways there are to make change for a dollar.
 * (If the solution only works for US currency, ask them to write a method that works for any currency type.)
 */
public class Fibonacci {
    static int e=0;
    private static int number = 10;

    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        fib.fibonacci(16);
        int numb = 10;
        for (int i = 0; i < 8; i++) {

            System.out.print(" " + fibonacci2(i));
        }
    }

    public void fibonacci(int num) {
        number = num;
        int num_i=0;
        int num_ii = 1;
        // System.out.print(num_i + ", " + num_ii + " ");
        for (int i = 2; i < number; i++) {
            num_i = num_i + num_ii;
            num_ii = num_i - num_ii;
             e++;
             num_i++;

            //  System.out.print(num_i + ", ");

        }

    }

    public static int fibonacci2(int numb) {

        if (numb == 1 || numb == 2) {

            return 1;

        } else {

            return fibonacci2(numb - 2) + fibonacci2(numb - 1);
        }
    }

}





