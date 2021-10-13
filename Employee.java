
public class Employee {
	String number;
	String name;
	int sal;
	
	void setNo(String eNo) {
		number = eNo;
	}
	void setName(String eName) {
		name = eName;
	}
	void setSalary(int eSal) {
		sal = eSal;
	}
	void printInfo() {
		System.out.println("사번: " + number);
		System.out.println("사원명: " + name);
		System.out.println("급여: " + sal);
	}

}
