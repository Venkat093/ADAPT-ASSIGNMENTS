class BubbleSort 
{
	public int[] bubbleSort(int arr[])
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			int ptr=1;
			while(ptr<arr.length)
			{
				if(arr[ptr]<arr[ptr-1])
				{
					int temp=arr[ptr];
					arr[ptr]=arr[ptr-1];
					arr[ptr-1]=temp;
				}
				ptr=ptr+1;
			}
			//System.out.println(arr[ptr]);
		}
		return arr;
	}
}

public class Assignment1Q8 {

	public static void main(String[] args) {
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		BubbleSort a=new BubbleSort();
		a.bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
