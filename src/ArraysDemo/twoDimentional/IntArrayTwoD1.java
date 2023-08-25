package ArraysDemo.twoDimentional;

public class IntArrayTwoD1 {

    public static void main(String[] args) {

        int[][] a = new int[4][3];

        a[0][0] = 23;
        a[0][1] = 24;
        a[0][2] = 25;

        a[1][0] = 33;
        a[1][1] = 44;
        a[1][2] = 55;

        a[2][0] = 36;
        a[2][1] = 47;
        a[2][2] = 57;

        a[3][0] = 66;
        a[3][1] = 77;
        a[3][2] = 87;

        int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<row;i++) //rows
        {
            for (int j=0;j<col;j++) // col
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
