public class matrix
{
	public static void main(String args[])
	{
		int rows=2,columns=4;
		int [][]MatrixA={{1,2,3,4},{4,3,2,1}};
		int [][]MatrixB={{4,3,2,1},{1,2,3,4}};
		int [][]sum=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				sum[i][j]=MatrixA[i][j]+MatrixB[i][j];
			}
		}
		System.out.println("sum of given matrix is:");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println(sum[i][j]+"");
			}
		System.out.println();
		}
	}
}