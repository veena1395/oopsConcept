package org.sample;

public class Greens2 extends Greens1 {
@Override
public void greenTambaram(float rate) {
	System.out.println("4.2");
}
public void greenAdayar() {
System.out.println("4.3");
}
public static void main(String[] args) {
	Greens2 q=new Greens2();
	q.greenTambaram(3);
	q.greenOmr(2);
	q.greenAdayar();
}
}
