package org.sample;

public class Interface3 implements Interface1,Interface2 {

	@Override
	public void tour3() {
		System.out.println("ooty");
		
	}

	@Override
	public void tour1() {
		System.out.println("kodaikanal");
		
	}

	@Override
	public void tour2() {
		System.out.println("shimla");
		
	}
	public static void main(String[] args) {
		Interface3 vv=new Interface3();
		vv.tour2();
		vv.tour3();
		vv.tour1();
	}

}
