package selectionsort;

public class Main {

	public static void main(String[] args) {
		// selection sort = search through an array and keep track of the minimum value during 
		//			         each iteration. At the end of each iteration, we swap values.
		
		//				 Quadratic time O(n^2)
		//				 small data set = okay
		//				 large data set = BAD

		
		
		int array[] = {9,4,5,3,2,1,6,7,8};
		selectionSort(array);
		for(int i: array) {
			System.out.print(i +"  ");
		}
	}

	private static void selectionSort(int[] array) {
		
		for (int i = 0; i < array.length-1; i++) {
			int min =  i;
			for (int j =i+1 ; j < array.length; j++) {
				if(array[min]>array[j]) {
					min=j;
					
				}
			}
			int temp = array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}

}
