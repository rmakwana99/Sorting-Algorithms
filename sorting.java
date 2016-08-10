class sorting{
	public static void printarray(int[] array){
		for(int num:array)
			System.out.print(num+" ");
	}
	
	public static int[] bubbleSort(int[] array){
		int temp;
		for(int i=0;i<array.length-1;i++){
			for(int j=1;j<array.length-i;j++){
				if(array[j]<array[j-1]){
					//Swaping the both number.
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	
	public static int[] selectionSort(int[] array){
		int temp,min;
		for(int i=0;i<array.length-1;i++){
			min=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[min])
					min=j;
			}
			//Swaping min value at right possition.
			temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array){
		int value,hole;
		for(int i=1;i<array.length;i++){
			value=array[i];
			hole=i;
			
			while(hole>0 && array[hole-1]>value){
				array[hole]=array[hole-1];
				hole--;
			}
			array[hole]=value;
		}
		return array;
	}
	
	public static int[] merge(int[] left,int[] right, int[] array){
		int nl=left.length;
		int nr=right.length;
		int i=0,j=0,k=0;
		while(i<nl && j<nr){
			if(left[i]<=right[j]){
				array[k++]=left[i++];
			}
			else{
				array[k++]=right[j++];
			}
		}
		while(i<nl){
			array[k++]=left[i++];
			
		}
		while(j<nr){
			array[k++]=right[j++];
		}
		return array;
	}
	
	public static int[] mergeSort(int[] array){
		int n=array.length;
		if(n<2)
			return array;
		else{
			int mid=n/2;
			int[] left=new int[mid];
			int[] right=new int[n-mid];
			for(int i=0;i<mid;i++)
				left[i]=array[i];
			for(int j=mid;j<n;j++)
				right[j-mid]=array[j];
			
			mergeSort(left);
			mergeSort(right);
			merge(left,right,array);
		}
		return array;
	}
	public static int partition(int[] array,int start,int end){
		
		if(start>=end){
			return start;
		}
		else{
			int pivot=array[end];
			int pindex=start;
			int temp,temp1;
			for(int i=start;i<end;i++){
				if(array[i]<=pivot){
					//swaping the array[i] and array[pindex]
					temp=array[i];
					array[i]=array[pindex];
					array[pindex]=temp;
					pindex++;
				}
				
			}
			//swaping the pivot and array[pindex]
			temp1=array[end];
			array[end]=array[pindex];
			array[pindex]=temp1;
			
			return pindex;
		}
		
		
	}
	
	public static int[] quicksort(int[] array,int start,int end){
		
		if(start>=end){
			return array;
		}
		else{
			int pindex=partition(array,start,end);
			quicksort(array,start,pindex-1);
			quicksort(array,pindex+1,end);
		}
		return array;
		
	}
	
		
	static int n;
	public static int[] heapSort(int[] array){
		heapify(array);
		for(int i=n;i>0;i--){
			swap(array,0,i);
			n--;
			maxheap(array,0);
		}
		return array;
	}
	public static void heapify(int[] array){
		n=array.length-1;
		
		for(int i=n/2;i>=0;i--){
			maxheap(array,i);
		}
	}
	public static void maxheap(int[] array,int i){
		int left=2*i;
		int right=(2*i)+1;
		int max=i;
		
		if(left<=n && array[left]>array[i])
			max=left;
		if(right<=n && array[right]>array[max])
			max=right;
		
		if(max!=i){
			swap(array,i,max);
			maxheap(array,max);
		}
	}
	public static void swap(int array[],int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	public static int[] radixSort(int[] array){
		int n=array.length;
		int max=array[0];
		for(int i=1;i<n;i++)
			if(array[i]>max)
				max=array[i];
		
		for(int exp=1;max/exp>0;exp*=10){
			int[] out=new int[n];
			int i;
			int[] count=new int[10];
			
			for(i=0;i<n;i++)
				count[(array[i]/exp)%10]++;
			
			for(i=1;i<10;i++)
				count[i]+=count[i-1];
			
			for(i=n-1;i>=0;i--){
				out[count[(array[i]/exp)%10]-1]=array[i];
				count[(array[i]/exp)%10]--;
			}
			
			
			for(i=0;i<n;i++)
				array[i]=out[i];
		}
		return array;
	}
	
	public static int[] bucketSort(int[] array){
		int[] sorted=new int[array.length];
		int i,j,outpos=0;
		
		int max=array[0];
		for(i=1;i<array.length;i++)
			if(max<array[i])
				max=array[i];
		
		int[] bucket=new int[max+1];
		
		for(i=0;i<array.length;i++)
			bucket[array[i]]++;
		
		for(i=0;i<bucket.length;i++)
			for(j=0;j<bucket[i];j++)
				sorted[outpos++]=i;
		
		return sorted;
	}
	
}