package day21.ScannerAndStringClass;
import java.util.Scanner;
public class ScannerClass2 {

	public static void main(String[] args) {
		int[] empId=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<empId.length;i++) {
			System.out.println("Insert array empId element in index: "+i);
			empId[i]=s.nextInt();
		}
		int i=0;
		for(int num:empId) {
			System.out.println("Index "+i+": "+num);
			i++;
		}

	}

}
