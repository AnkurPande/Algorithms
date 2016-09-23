package sorting_algorithms;

public class InsertionSort {

	static void display(int[] array){
		
		System.out.print("[");
		for(int i:array){
				System.out.print(i+"");
		}
		System.out.print("]");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {4,8,3,45,21,1,12,9};
		InsertionSort.display(array);
		
		int valueToInsert, holePos, i;
		for(i = 1;i<array.length;i++){
			valueToInsert = array[i];
			holePos = i;
			
			while(holePos>0 && valueToInsert<array[holePos-1]){
				array[holePos] = array[holePos-1];
				holePos--;
				System.out.println("Value Moved "+array[holePos]);
			}
			
			if(holePos!=i){
				array[holePos] = valueToInsert;
			}

			System.out.println("Iteration number "+i);
			InsertionSort.display(array);
		}
		
	}

}
