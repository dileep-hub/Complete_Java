package SortingAlgoArray;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {4,2,7,5,-6,-1};
		int n = a.length;
		
		for (int i=0; i<n-1; i++) {
			boolean sorted = true;
			for (int j=0; j<n-i-1; j++) {
				if (a[j+1] < a[j]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					sorted = false;
				}
			}
			if(sorted) break;
		}
		
		for (int item: a) {
			System.out.print(item + " ");
		}

	}

}

//output
//
//-6 -1 2 4 5 7 
