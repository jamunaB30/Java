public class LargestArray
{
	public static void main(String args[])
	{
		int arr[]=new int[]{11,33,22,44,55,66};
		int temp=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>temp)
			temp=arr[i];
		}
		System.out.println("Largest element in the array is "+temp);
	}
}
