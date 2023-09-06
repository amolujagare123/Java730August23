package ClassAndConstructors.pack2;

import ClassAndConstructors.pack1.Java1;

public class Java3 extends Java1{

    public static void main(String[] args) {
        Java1 ob = new Java1();
        ob.a = 10 ;
     /*   ob.d = 23.67;
        ob.c = 'g';
        ob.str = "txt";
        ob.display();*/


        Java3 j3 = new Java3();
        j3.a =  10;
        j3.c = 'h'; // protected member
    }
}
