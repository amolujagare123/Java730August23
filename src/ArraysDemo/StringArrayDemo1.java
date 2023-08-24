package ArraysDemo;

public class StringArrayDemo1 {

    public static void main(String[] args) {

        String[] stArr = new String[5];

        stArr[0] = "Amol";
        stArr[1] = "Pallavi";
        stArr[2] = "Nitish";
        stArr[3] = "Saimonika";
        stArr[4] = "Laxmi";

        System.out.println("Length="+stArr.length);
        for(String ss : stArr)
        {
            System.out.println(ss);
        }


    }
}
