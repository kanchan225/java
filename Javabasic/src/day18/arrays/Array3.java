package day18.arrays;

public class Array3 {

	public static void main(String[] args) {
		int[] numbers= {2, -9, 0, 5, 12, -25, 22, 9, 8,12};
		double sum=0;
		double average;
		for(int num:numbers) {
			sum=sum+num;//o+2=2,2-9=-7,----
			     //or
			//sum += num;====>sum=sum+num;
		}
		int arraylength=numbers.length;
		average= sum/arraylength;
		//average= sum/numbers.length;
		System.out.println("Sum = "+sum);
		System.out.println("Average = "+average);

	}

}
