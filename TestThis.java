class User{

	String name;
	int age;
	String emailid;

	User(String name,int age){
		this.name= name;
		this.age= age;
		System.out.println("User(2 param)"+name +" "+age);		
	}

	User(String name,int age,String emailid){
		this(name,age);
		this.emailid=emailid;
		System.out.println("User(3 param)"+name +" "+age+" "+emailid);
	}
	void display(){
		System.out.println("Name = "+name +" Age = "+age+" Email = "+emailid);	
	}
}
class TestThis{
	public static void main(String[] args){
		User u1 = new User("U1",11);
		User u2 = new User("U2",22,"U2@user.com");
		u1.display();
		u2.display();
	}

}