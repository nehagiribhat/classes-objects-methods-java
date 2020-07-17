class First {
	public void show() {
		System.out.println("One");
	}
}

//inheritance
class Second extends First {
	
	@Override
	public void show() {
		System.out.println("Second");
	}

	public int add(int x, int y) {
		return x+y;
	}

	//Overload
	public double add(double x,double y) {
		return x+y;
	}
}


//encapsulation example
class EncapsulTest {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}
}

//abstraction
abstract class TwoWheeler {
	
	public abstract void run();
}


class Honda extends TwoWheeler{

	public void run(){
		System.out.println("\nbike is Running..");
	}
}


class MyClass {
	
	public static void main(String[] args) {

		First a=new First();
		a.show();

		Second b=new Second();
		b.show();

		System.out.println(b.add(4,2));
		System.out.println(b.add(5.,2.));	 //polymorphism

		EncapsulTest encap = new EncapsulTest();
		encap.setName("Sandeep's");
		System.out.print("Name : " + encap.getName() );

		TwoWheeler test = new Honda();
		test.run();
	}
}
