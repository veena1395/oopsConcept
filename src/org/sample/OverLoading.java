package org.sample;

public class OverLoading {
	public void college(int code) {
System.out.println(code);
}
	public void college(String name,float rate) {
System.out.println(name+"\n"+rate);
	}
	public void college(long phn,String doj) {
System.out.println(phn+"\n"+doj);
	}
	public void college(String course) {
System.out.println(course);
	}
	public static void main(String[] args) {
		OverLoading z=new OverLoading();
		z.college(3120);
		z.college("ECE");
		z.college(123456789l, "29/5/19");
	}
}
