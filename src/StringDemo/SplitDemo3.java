package StringDemo;

public class SplitDemo3 {
    public static void main(String[] args) {
        String str = "its either a horse or some other thing ordered";
        String[] stArr = str.split("or");

        for (int i=0;i< stArr.length ;i++)
            System.out.println(stArr[i]);
    }
}
