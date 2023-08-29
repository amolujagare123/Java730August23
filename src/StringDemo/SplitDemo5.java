package StringDemo;

public class SplitDemo5 {
    public static void main(String[] args) {
        String str = "We want to go to Toronto";
        String[] stArr = str.split(" ");

        // print the words whose second character is o

        for (int i=0;i< stArr.length ;i++) {

               System.out.println(stArr[i]);
        }
    }
}
