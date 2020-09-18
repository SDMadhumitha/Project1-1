package org.edu;

public class Arts extends Education {
private void bSc() {
System.out.println("Bachelor of Science");
}
private void bEd() {
System.out.println("Bachelor of Education");
}
private void bA() {
System.out.println("Bachelor of Arts");
}
private void bBA() {
System.out.println("Bachelor of Business Administration");
}
@Override
	public void ug(String ug) {
		System.out.println("UG is "+ug);
	}
public static void main(String[] args) {
	Arts a = new Arts();
	a.bSc();
	a.bEd();
	a.bA();
	a.bBA();
	a.ug("BCA");
	
	
	System.out.println("done");
}
}