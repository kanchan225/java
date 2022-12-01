package day18.Assignment2_Array;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		
			int A[] ={2,5,6,7,15,12};
			int max1=0,max2=0, max3=0;
			for(int i=0;i<A.length;i++) {
				if(A[i]>max1) {//2>0|5>2|7>5|6<7|15>7|12<15
					max3=max2; //0  |0  |2      |7
					max2=max1; //0  |2  |5
					max1=A[i]; //2  |5  |7      |15
				}
				else if(A[i]>max3 && A[i]!=max2){//6>2&&6!=5|12>7&&12!=15
					max3=A[i];//6 |12
				}
			}
	        System.out.println("Third largest element of array A is : "+max3);
		

	}

}
