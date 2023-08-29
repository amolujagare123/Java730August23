package StringDemo;

public class SplitDemo4 {
    public static void main(String[] args) {
        String str = "Hey baby you are so lovely";
        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ;i++) {

            int l = stArr[i].length();

            if(stArr[i].charAt(l-1)=='y')
               System.out.println(stArr[i]);
        }
    }
}
