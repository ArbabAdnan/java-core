package binarysearch;


public class Main {

	public static void main(String[] args) {
		//binary search = search algorithm that finds the position
		//				  of a target value within a sorted array
		//				  half of the array is eliminated during each step
		
		// 				   -1 means values is not found
		
		int array[] = new int [100000];
		int target =77000;
		
		for(int i = 0; i <array.length;i++) {
			array[i] =i;
//			System.out.println(array[i]);
			
			//int index = Arrays.binarySearch(array, target);
		}
			int index = binarysearch(array,target);
			if(index==-1) {
				System.out.println(target+ " not found");
			}else {
				System.out.println("Element found at: "+index);
			}
				
		}
	

	private static int binarysearch(int[] array, int target) {
		int low=0;
		int high=array.length-1;
		
		while(low<=high) {
			int middle = low+(high-low)/2;
			int value = array[middle];
			System.out.println("middle "+value);
			
			if(value<target)low=middle+1;
			else if(value>target) high=middle-1;
			else return middle;//target found
		}
		return -1;
	}

}
