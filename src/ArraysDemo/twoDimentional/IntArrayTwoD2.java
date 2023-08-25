package ArraysDemo.twoDimentional;

public class IntArrayTwoD2 {

    public static void main(String[] args) {

        int[][] a = {
                {12,13,14,45,11},
                {32,43,54,56,22},
                {33,44,55,78,33},
        };




       /* int row = a.length;
        int col = a[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);*/

        for (int i=0;i<a.length;i++) //rows
        {
            for (int j=0;j<a[0].length;j++) // col
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
