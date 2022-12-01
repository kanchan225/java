package day18.arrays;
//Programm for checking elements of array are sorted or not
import java.util.Arrays;

public class M_Array5 {

	public static void main(String[] args) {
		char section[]= {'a', 'b', 'c', 'd'};
		//duplicate array:
		char copyArray[]=section.clone();
		
		//sorting copyFrom in ascending order:
		Arrays.sort(section);
		boolean result=Arrays.equals(copyArray, section);
		System.out.println(result);
		//System.out.println(Arrays.equals(copyArray, section));

	}

}
