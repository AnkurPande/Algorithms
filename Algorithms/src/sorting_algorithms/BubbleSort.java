package sorting_algorithms;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp =0 ;
		boolean swapped = false;
		int[] array = { 1,  2,  3,  5,  7,  8,  10,  11,  61,  78 };
		for(int k: array){
			System.out.print(" "+k+" ");
		}
		System.out.println();
		for(int i = 0; i<array.length;i++){
			for(int j =0; j<array.length-1;j++){
				System.out.print("Items compared ["+array[j]+" "+ array[j+1]+ " ]" );
				if(array[j]>array[j+1]){
					temp =array[j+1];
					array[j+1]= array[j];
					array[j] = temp;
					swapped=true;
					System.out.print(" => swapped["+array[j]+" "+ array[j+1]+ " ]" );
				}
				else{
					System.out.print(" = > not swapped ["+array[j]+" "+ array[j+1]+ " ]" );
				}
				System.out.println();
			}
			
			if(!swapped){
				break;
			}
			
			System.out.println("Array after Iteration #"+i);
			for(int k: array){
				System.out.print(" "+k+" ");
			}
			System.out.println();
		}
	}

}
