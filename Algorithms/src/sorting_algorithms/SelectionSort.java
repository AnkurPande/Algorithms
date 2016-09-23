package sorting_algorithms;

public class SelectionSort {

	static void display(int[] array){
		
		System.out.print("[ ");
		for(int i:array){
				System.out.print(i+",");
		}
		System.out.print(" ]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated 0method stub
		int[] array = {4,8,3,45,21,1,12,9,17,2};
		int minIndex,temp;
		SelectionSort.display(array);
		
		for(int i=0;i<array.length;i++){
			minIndex = i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[minIndex]){
					minIndex=j;
				}
			}
			if(minIndex!=i){
				temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
		
		SelectionSort.display(array);
	}

}
