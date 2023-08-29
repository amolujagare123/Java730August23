package StringDemo;

public class SplitDemo2 {
    public static void main(String[] args) {
        String str = "two times it has to be ordered";
        String[] stArr = str.split("o");

        for (int i=0;i< stArr.length ;i++)
            System.out.println(stArr[i]);
    }
}
