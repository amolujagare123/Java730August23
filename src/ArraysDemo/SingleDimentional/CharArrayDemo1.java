package ArraysDemo.SingleDimentional;

public class CharArrayDemo1 {

    public static void main(String[] args) {

        char[] ch = new char[5];

        ch[0] = 'j';
        ch[1] = 'k';
        ch[2] = 'l';
        ch[3] = 'm';
        ch[4] = 'n';

        int l = ch.length;
        System.out.println("Length="+l);
        for(char cc : ch)
        {
            System.out.println(cc);
        }


    }
}
