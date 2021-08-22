public class SecondClass extends FirstClass{
	
	public static void main(String [] args){
		  SecondClass programm = new SecondClass();
        programm.start();
    }

    public void start() {
        FirstClass fc = new FirstClass();
        fc.displayProfile();
        fc.getHeight(34.4);
    }
}
class FirstClass{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public String setName(String str){
		this.name = str;
		return str;
	}
	public int setAge(int a){
		this.age = a;
		return a;
	}
	public FirstClass(){
		name = "Ibrahim";
		age = 31;
	}
	public void displayProfile(){
		System.out.println("My name is: "+name+". I am "+age);
		favQuote("Hello");
	}
	public double getHeight(double height){
		System.out.println("My height is: "+height);
		return height;
	}
	private String favQuote(String quote){
		quote = "I love Java";
		System.out.println(quote);
		return quote;
	}

}
