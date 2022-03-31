 abstract class LivingBeing{
	 abstract void talk();
 }
 
class Person extends LivingBeing{
	String fname,lname;
	
	void talk(){
		System.out.println(this.fname+" is talking");
	}
	void walk(){
		System.out.println(this.fname+" is walking");
	}
	void eat(){
		System.out.println(this.fname+" is eating");
	}
	//String args
	public static void main(String args[]){
		Person p1=new Person();
		p1.fname="Sachin";
		p1.lname="Tendulkar";
		p1.talk();
		p1.walk();
		p1.eat();
	}
	
}

