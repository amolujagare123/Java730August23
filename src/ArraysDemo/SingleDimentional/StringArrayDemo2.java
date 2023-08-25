package ArraysDemo.SingleDimentional;

public class StringArrayDemo2 {

    public static void main(String[] args) {

        String[] stArr = {"Amol","Hari","Pallvi","Saimonika","Nilish","laxmi"};

       /* stArr[0] = "Amol";
        stArr[1] = "Pallavi";
        stArr[2] = "Nitish";
        stArr[3] = "Saimonika";
        stArr[4] = "Laxmi";*/

        System.out.println("Length="+stArr.length);
       /* for(String ss : stArr)
        {
            System.out.println(ss.charAt(2));
        }*/

        for (int i=0;i< stArr.length;i++)
        {
            System.out.println(stArr[i].charAt(2));
        }


    }
}
