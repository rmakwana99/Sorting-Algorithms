class sortmain{
	public static void printarray(int[] array){
		for(int num:array)
			System.out.print(num+" ");
	}
	public static void main(String[] args){
		int[] array={100,5,4,2,89,47,9,7,1,1};
		System.out.println("the Unsorted array.");
		printarray(array);
		System.out.println("\nthis is bubble Sort.");
		int[] bubble=sorting.bubbleSort(array);
		printarray(bubble);
		
		int[] array1={18,3,15,92,7,25,1};
		System.out.println("\n\nthe Unsorted array1.");
		printarray(array1);
		System.out.println("\nthis is Selection Sort.");
		int[] selection=sorting.selectionSort(array1);
		printarray(selection);
		
		int[] array2={102,45,87,12,3,108,2,1};
		System.out.println("\n\nthe Unsorted array2.");
		printarray(array2);
		System.out.println("\nthis is Insertion Sort.");
		int[] insertion=sorting.insertionSort(array2);
		printarray(insertion);
		
		int[] array3={25,68,98,14,25,16,3,8,1};
		System.out.println("\n\nthe Unsorted array3.");
		printarray(array3);
		System.out.println("\nthis is Merge Sort.");
		int[] merge=sorting.mergeSort(array3);
		printarray(merge);
		
		int[] array4={25,68,98,14,25,16,3,8,1};
		System.out.println("\n\nthe Unsorted array4.");
		printarray(array4);
		System.out.println("\nthis is Quick Sort.");
		int start=0,end=array4.length-1;
		int[] quick=sorting.quicksort(array4,start,end);
		printarray(quick);
		
		int[] array5={51,9,91,13,37,3,48,10};
		System.out.println("\n\nThe Unsorted array5.");
		printarray(array5);
		int[] heap=sorting.heapSort(array5);
		System.out.println("\nThis is heap Sort.");
		printarray(heap);
		
		int[] array6={2,104,200,65,19,78,133,309,4511,13};
		System.out.println("\n\nthe Unsorted array6.");
		sorting.printarray(array6);
		System.out.println("\nThis is Radix Sort.");
		int[] radix=sorting.radixSort(array6);
		sorting.printarray(radix);
		
		int[] array7={5,24,30,84,21,29,6,71,8};
		System.out.println("\n\nThe Unsorted array7.");
		printarray(array7);
		int[] bucket=sorting.bucketSort(array7);
		System.out.println("\nThis is bucket Sort.");
		printarray(bucket);
		
	}
}