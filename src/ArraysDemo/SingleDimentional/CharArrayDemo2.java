package ArraysDemo.SingleDimentional;

public class CharArrayDemo2 {

    public static void main(String[] args) {

        char[] ch = {'a','b','c','d','e','f','g'};

        int l = ch.length;

        ch[3] = '!';
        System.out.println("Length="+l);
        for(char cc : ch)
        {
            System.out.println(cc);
        }


    }
}
