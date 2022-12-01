package day18.arrays;

public class M_Array2 {

	public static void main(String[] args) {
		int arr[][]= new int[][]{{1,2,3}, {4,5} ,{6,7,8,9}};//each entry is one row
		//or int arr[][]= {{1,2,3}, {4,5} ,{6,7,8,9}};
		for(int i=0;i<arr.length;i++) {//row=0 |row=1 | row=2
        	for(int j=0;j<arr[i].length;j++) {//row=0,col=0,1,2 | row=1,col=0,1 | row=0,1,2,3
        		//System.out.print("Row: "+i + " cell: "+arr[i].length);
        		System.out.print(arr[i][j]+" ");	
        	}
        	System.out.println();
      }
//		char chararr[][]= {{'a','b'},{'c','d',},{'e','f','g'}};
//		for(char[] alpha:chararr){		
//			System.out.println(alpha);
//		for(char[] alpha1:chararr){
//			System.out.println(alpha1);
//	    }
//		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}

}
