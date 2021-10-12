
public class HR {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setNo("210001");//사번 210001
		e1.setName("김건우");//사원명 김건우
		e1.setSalary(500);//급여는 500
		e1.printInfo();	//사번 210001, 사원명 김건우, 급여 500
		
		Employee e2 = new Employee();
		e2.setNo("210002");

	}

}
