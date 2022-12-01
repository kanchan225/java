package day18.Assignment2_Array;

public class FrequencyOfElement {

	public static void main(String[] args) {
		int age[]= {10, 25, 10, 30, 10, 25, 10, 20, 10, 30, 45};
		int fre[]=new int[age.length];
		
		int visited=-1;
		for(int i=0; i<age.length; i++) {
			int count=1;
			for(int j=i+1; j<age.length; j++) {
				if(age[i]==age[j]) {//10=10
					count++;//5
					fre[j]=visited;
				}
			}
			if(fre[i]!=visited) {
				fre[i]=count;
			}
		}
        System.out.println("********************************************");
        for(int i=0; i<fre.length; i++) {
        	if(fre[i]!=visited) {
        		System.out.println("Frequency of "+age[i]+" : "+fre[i]);
        	}
        }
	}

}
