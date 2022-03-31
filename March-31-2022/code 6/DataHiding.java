 class Person{
	private String fname,lname;
	
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
		p1.fname="Saurav";
		p1.lname="Ganguly";
		p1.talk();
		p1.walk();
		p1.eat();
	}
	
}
class MyDemo{
	public static void main(String args[]){
		Person p1=new Person();
		p1.fname="Sachin";
		p1.lname="Tendulkar";
		System.out.println(p1.fname +" "+ p1.lname);
	}
}