package test.ch07.package2;

public class Parent {
	
    public String nation;
    
    public Parent () {
//		this("대한민국");
	    System.out.println("Parent() call");
	}
    
    public Parent(String nation) {
    	System.out.println(nation);
		this.nation = nation;
		System.out.println("parent(string nation) call");
	}
}
