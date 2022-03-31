 class Person{
	String fname,lname;
	
	void talk(){
		System.out.println(this.fname+" "+this.lname+" is talking");
	}
	void walk(){
		System.out.println(this.fname+" "+this.lname+" is walking");
	}
	void eat(){
		System.out.println(this.fname+" "+this.lname+" is eating");
	}
	//String args
	public static void main(String args[]){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		Person p1=new Person();
		p1.fname=args[0];
		p1.lname=args[1];
		p1.talk();
		p1.walk();
		p1.eat();
	}
	
}
 class MyWish{
	public static void main(String args[]){
		System.out.println("I cfreated this class Because MyWish");
	}
}
