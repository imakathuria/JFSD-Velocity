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
 class Employee extends Person{
	 String dept;
	 void work(){
		System.out.println(this.fname+" "+this.lname+" is working in office");
	}
	public static void main(String args[]){
		Employee e1=new Employee();
		e1.fname="Sachin";
		e1.lname="Tendulkar";
		e1.dept="Batting";
		e1.talk();
		e1.walk();
		e1.eat();
		e1.work();
	}
}