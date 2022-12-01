package day18.arrays;
class Testarray2{
	static int[] getarray() {
		int num[]=new int[3];
		num[0]=10;
		num[1]=13;
		num[2]=15;
		return num;
		//or
		//return new int[] {20, 50, 60, 95, 55};
	}
}
public class Array5 {

	public static void main(String[] args) {
		int arr[]=Testarray2.getarray();
        System.out.println("printing the values of an array");
        for(int i=0;i<arr.length;i++) {
        	 System.out.println(arr[i]);
        }
        System.out.println(arr[0]);
	}
	static int getarray() {
		int num[]=new int[3];
		num[0]=10;
		num[1]=13;
		num[2]=15;
		return num[0];
	}
}
