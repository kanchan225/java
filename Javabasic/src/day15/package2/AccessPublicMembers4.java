package day15.package2;

//import day15.package1.PublicMembers;

public class AccessPublicMembers4 {

	public static void main(String[] args) {
		System.out.println("Accessing public members from another class outside the package");
		day15.package1.PublicMembers p1=new day15.package1.PublicMembers();
		System.out.println(p1.accnum);
		p1.displayAccnum();
		//System.out.println(PublicMembers.num);
		System.out.println(day15.package1.PublicMembers.num);
        
		day15.package1.PublicMembers p2=new day15.package1.PublicMembers();
	}

}
