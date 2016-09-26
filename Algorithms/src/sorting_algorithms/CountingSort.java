package sorting_algorithms;


public class CountingSort {

	int[] array = null;
	int maxVal = 0;
	
	public void countingSort(int[] arr){
		int[] output = new int[arr.length];
		int max = arr[0]; 
		int min = arr[0];
		for(int i=0; i<arr.length;i++){
			if(arr[i]>max) max=arr[i];
			else if(min>arr[i]) min =arr[i];
		}
		
		int[] count = new int[max-min+1];
			
		for(int j = 0; j<count.length; j++){
			count[j]=0;
		}
		
		for(int i=0; i<arr.length; i++){
			++count[arr[i]];
		}
		
		for(int j =0;j<count.length;j++){
	//		System.out.print(count[j]+" ");
		}
		
	//	System.out.println();
		
		for(int j =1;j<count.length;j++){
			count[j] += count[j-1];
		}
		
		for(int j =0;j<count.length;j++){
		//	System.out.print(count[j]+" ");
		}
	//	System.out.println();
		for(int i=0; i<arr.length;i++){
		//	System.out.print((count[arr[i]]-1)+" ");
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		//System.out.println();
		for(int j =0;j<output.length;j++){
			System.out.print(output[j]+" ");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingSort s = new CountingSort();
		int[] array = {30,15,21,4,1,0};
		s.countingSort(array);
	}

}
