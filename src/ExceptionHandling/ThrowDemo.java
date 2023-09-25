package ExceptionHandling;

public class ThrowDemo {

    void checkNumber(int i)
    {
        if(i<=10 && i>=1)
            System.out.println("We are safe");
        else
            throw new ArithmeticException("We are in danger");
    }

    public static void main(String[] args) {
        ThrowDemo ob = new ThrowDemo();

        System.out.println("Start of the program");
        int a = 45;
        System.out.println("a="+a);
        ob.checkNumber(a);
        System.out.println("end of the program");


    }
}
