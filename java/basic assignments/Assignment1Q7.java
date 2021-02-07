
class SearchArray {
	public void searchArray(int[] arr,int Valuetocheck)
	{
		int n;
		int i=0;
		while(i<=arr.length)
		{
			if(arr[i]==Valuetocheck)
			{
				System.out.println("item found" + arr[i]);
			}
			else {
				
			}
			i=i+1;
			
		}
	}

}

public class Assignment1Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		SearchArray a=new SearchArray();
		a.searchArray(arr,19);

	}

}
