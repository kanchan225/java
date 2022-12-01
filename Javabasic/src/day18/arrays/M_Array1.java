package day18.arrays;

public class M_Array1 {

	public static void main(String[] args) {
		//declaring and initializing 2D array
		int[][] arr=new int[3][3];//3 row 3column
		System.out.println("Array row size: "+arr.length);//row count
		
		for(int i=0; i<arr.length; i++) {//row count
			for(int j=0; j<arr[i].length; j++) {//cell count on current row
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("*****************************");
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		//System.out.println(arr[1][2]);
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}

}
