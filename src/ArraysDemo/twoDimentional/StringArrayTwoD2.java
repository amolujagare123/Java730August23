package ArraysDemo.twoDimentional;

public class StringArrayTwoD2 {
    public static void main(String[] args) {
        String[][] stArr = {
                {"Amol", "Emily", "John"},
                {"Sophia", "Liam", "Ava"},
                {"Ethan", "Olivia", "Noah"},
                {"Emma", "William", "Mia"}
        };

        for (int i=0;i< stArr.length;i++) //rows
        {
            for (int j=0;j<stArr[0].length;j++) // col
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
