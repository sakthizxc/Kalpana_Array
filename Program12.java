package array_programs;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {3,1,9,5,2};
		int Fs=arr[0];
		int Ss=arr[1];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					Fs=arr[i];
					Ss=
				}
				else
				{
					Ss=arr[i];
				}
			}
		}
		System.out.println(Fs+""+Ss);
	}

}
