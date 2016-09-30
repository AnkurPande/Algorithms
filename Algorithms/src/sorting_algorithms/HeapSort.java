package sorting_algorithms;

public class HeapSort {

	// Java program for implementation of Heap Sort
	int[] data = null;
	int size =0;
	
	public HeapSort(int[] array){
		this.data = array;
		this.size = array.length;
	}
	
	public void heapify(int index){
		int largest    = index;
		int leftchild  = 2 * index + 1;
		int rightchild = 2 * index + 2;
		
		if(leftchild < size && data[leftchild] > data[largest]){
			largest = leftchild;
		}
		
		if(rightchild < size && data[rightchild] > data[largest]){
			largest = rightchild;
		}
		
		if(largest!=index){
			int swap = data[index];
			data[index] = data[largest];
			data[largest] = swap;
			
			heapify(largest);
		}
	}
	
	public int removeNext(){
		int next = data[0];
		data[0] = data[--size];
		heapify(0);
		return next;
	}
	
	public void sort(){
		for(int i = size/2 -1;i >=0; i--){
			heapify(i);
		}
		
		for(int i = size -1; i >=0; i--){
			int max = removeNext();
			data[i] = max;
		}
	}

	public void printHeap(){
		System.out.println();
		for(int i =0; i<data.length;i++){
			System.out.print(data[i]+ " ");
		}
	}
	
	public static void main(String args[]){
		int[] array = {4,1,3,2,2,2,16,10,14,8,7};
		HeapSort heapdemo = new HeapSort(array);
		heapdemo.sort();
		heapdemo.printHeap();
	}
}

