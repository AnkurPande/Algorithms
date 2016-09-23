package sorting_algorithms;

public class QuickSort {

	int[] array = null;
	
	void sort(int[] arr){
		if(arr == null || arr.length ==0){
			return;
		}
		this.array = arr;
		display(this.array);
		quicksort(0,array.length-1);
		display(this.array);
	}
	
	void swap(int num1, int num2){
		
	}
	
	void display(int[] arr){
		System.out.println();
		for(int element: arr){
			System.out.print(element+ " ,");
		}
		System.out.println();
	}
	public void quicksort(int low, int high){
		int i = low, j =high;
		int pivot = array[low +(high-low)/2];
		while(i<=j){
			
			while(array[i]<pivot){
				//Do nothing Keep checking
				i++;
			}
			
			while(array[j]>pivot){
				//Do nothing keep checking
				j--;
			}
			
			if(i<=j){
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++; j--;
			}
		}
		
		if(low<j)
			quicksort(low,j);
		if(i<high)
			quicksort(i,high);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,1,1,1,1,1,1,1,1};
		QuickSort q = new QuickSort();
		q.sort(arr);
	}

}
