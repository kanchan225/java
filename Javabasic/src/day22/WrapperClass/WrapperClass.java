package day22.WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int a=20;
		Integer k=new Integer(a);//Converting int into integer explicitely
		Integer l=new Integer(20);//Converting int into integer explicitely
        Integer j=a;//autoboxing
        System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);
        System.out.println("******Unboxing of boxed object********");
        Integer a1=new Integer(25);
        int i1=a1.intValue();//converting integer to int explicitely
        //float f=a1.intValue();
        //float f1=a1.floatValue();
        System.out.println("a1: "+a1+"\ni1: "+i1);
        
        System.out.println("a1==i1 : "+(a1==i1));
        System.out.println("a1.equals(i1) : "+a1.equals(i1));
        Float F1=new Float(30);
        float f4=F1.floatValue();
        int f3=F1.intValue();
       // int f3=F1.floatValue();
        System.out.println("F1: "+F1+"\nf2: "+f3);
	}

}
