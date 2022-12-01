package day18.arrays;
class Testarray {
	static void min(int arr[]) {
		int min = arr[0];//33 ->
		for(int i=1; i<arr.length;i++) {
			if (min > arr[i]) { //33>13 | 13>4 | 4<50 | 4<15 |4>1
				min=arr[i];//13 , 4, 1
			}
		}
		System.out.println("Min number in array is: "+min);
	}
	static void max(int arr[]) {
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if (max < arr[i]) { //33>13 |33>4 | 33<50 | 50>15 |50>1
				max=arr[i];//50
			}
		}
		System.out.println("Max number in array is: "+max);
	}
}
public class Array4 {

	public static void main(String[] args) {
	int a[] = {33, 13, 4, 50,15, 1}	;//declaring and initializing an array
     Testarray.min(a);//passing array to method
     Testarray.max(a);//passing array to method
     //or
     Testarray.min(new int []{22, 45, 12, 18, 10});
     Testarray.max(new int []{22, 45, 12, 18, 10});
	}

}
