package ArraysDemo.twoDimentional;

public class StringArrayTwoD1 {
    public static void main(String[] args) {
        String[][] stArr = new String[4][3];

        stArr[0][0] = "Amol";
        stArr[0][1] = "Emily";
        stArr[0][2] = "John";

        stArr[1][0] = "Sophia";
        stArr[1][1] = "Liam";
        stArr[1][2] = "Ava";

        stArr[2][0] = "Ethan";
        stArr[2][1] = "Olivia";
        stArr[2][2] = "Noah";

        stArr[3][0] = "Emma";
        stArr[3][1] = "William";
        stArr[3][2] = "Mia";

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
