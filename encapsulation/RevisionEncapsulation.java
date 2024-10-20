package encapsulation;

public class RevisionEncapsulation {
public  void m1(String a) {
	System.out.println("String");
}
public void m1(int a,long b) {
	System.out.println(" int,long");
}
public static void main(String[] args) {
	RevisionEncapsulation rc = new RevisionEncapsulation();
    rc.m1(null);
    rc.m1(4, 5);
}
	
		}


