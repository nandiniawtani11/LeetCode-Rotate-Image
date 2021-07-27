class Solution {
    public void rotate(int[][] matrix) {
        int[][] arr=new int[matrix.length][matrix.length];
        int i=matrix.length-1;
        int j=0;
        int k=j;
        while(j<matrix.length)
        {
            k=0;
            i=matrix.length-1;
            while(i>=0)
            {
                arr[j][k]=matrix[i][j];
                i--;
                k++;
            }
            j++; 
        }
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix.length;j++)
            {
                matrix[i][j]=arr[i][j];
            }
        }
    }
}
