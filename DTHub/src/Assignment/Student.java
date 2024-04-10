package Assignment;

public class Student {
	int RollNo;
	int Age;

	public void display1() {

		System.out.println("Welcome to all of you");
	}

	public void display2() {

		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) {

		Student priya = new Student();
		priya.RollNo = 48;
		priya.Age = 30;
		System.out.println("RollNo:" + priya.RollNo);
		System.out.println("Age:" + priya.Age);
		priya.display1();
		priya.display2();

	}
}
