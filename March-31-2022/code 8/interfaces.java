interface A{
	void a();
}

interface B{
	void b();
}

class C implements A,B{
	public void a(){
		System.out.println("This is a");
	}
	public void b(){
		System.out.println("This is b");
	}
	public static void main(String args[]){
		C c1=new C();
		c1.a();
		c1.b();
	}
}
