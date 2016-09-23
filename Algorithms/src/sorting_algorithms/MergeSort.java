package sorting_algorithms;

public class MergeSort {

	int[] array = {4,8,3,45,21,1,12,9,17,2};
	int[] tempArray = new int[array.length];
	
	public void sort(int low, int high){
		int mid;
		if(low<high){
			mid = (low+high)/2;
			sort(low,mid);
			sort(mid+1,high);
			merge(low,mid,high);
		}
		else return;
	}
	
	public void merge(int low, int mid, int high){
		int l1, l2, i;
		for(l1=low, l2=mid+1, i=low; l1<=mid && l2<=high; i++){
			if(array[l1]<=array[l2]){
				tempArray[i] =array[l1];
				l1++;
			}
			else{
				tempArray[i]=array[l2];
				l2++;
			}
		}
		
		while(l1<=mid){
			tempArray[i]= array[l1];
			i++;l1++;
		}
		
		while(l2<=high){
			tempArray[i] = array[l2];
			i++;l2++;
		}
		
		for(i=low;i<=high;i++){
			array[i] = tempArray[i];
		}
	}
	
	public void displayArray(){
		for(int i: array){
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort s = new MergeSort();
		System.out.print("Before Sorting... ");
		s.displayArray();
		s.sort(0, s.array.length-1);
		System.out.print("After Sorting... ");
		s.displayArray();
	}

}
