package loops;

public class IncrementDecrementDemo1 {

    public static void main(String[] args) {

        int i = 10 ;

        System.out.println(i); // 10
        System.out.println(i++); // 10
        System.out.println(i);// 11
        System.out.println(++i);// 12
        System.out.println(i); // 12

 /*Post unary operators ( a++ / a- -  ):
Here first the statement is executed then increment or decrement happens

Pre unary operators ( ++a / - - a ):
Here first increment or decrement happens then the statement is executed.
*/

    }
}
