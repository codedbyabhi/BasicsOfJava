package com.nit.staticNonStaticBlock;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println(K.kk);//100
		//System.out.println(DK.m);//error
		K.runu();//Hello
		//DK.jump();//error
		System.out.println(F.mm);//200
		System.out.println(F.kk);//100
		F.jumpu();//Bye
		F.runu();//Hello
	}
}
class K{
	public static int kk = 100;
	public static void runu() {
		System.out.println("Hello");
	}
}
class F extends K{
	public static int mm = 200;
	public static void jumpu() {
		System.out.println("Byeee");
	}

}
