import java.util.Scanner;

/**
 * 고객객체용 클래스이다.
 * 고객정보(아이디, 비밀번호, 이름, 주소) 
 * @author ASUS H310M-E
 *
 */
class Customer{
	String id;
	String pwd;
	String name;
	String address;
	//Customer(){}
	/**
	 * 고객정보를 초기화한다.
	 * @param id 아이디
	 * @param pwd 비밀번호
	 * @param name 이름
	 * @param address 주소
	 */
	Customer(String id, String pwd, String name, String address){
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.address = address;
	}
	/**
	 * 고객정보를 출력한다.
	 * 출력예) 아이디: 1, 비밀번호: 2, 이름: 3, 주소: 3
	 */
	void printInfo() {
		System.out.println("아이디: " + id + ", 비밀번호: " + pwd + ", 이름: " + name + ", 주소: " + address);
	}
}

/**
 * 고객객체를 저장소에 추가, 조회, 수정, 삭제하는 클래스이다 (CRUD)
 * @author ASUS H310M-E
 *
 */
class CustomerDAO{
	Customer customers[]; //고객저장소
	int count;//저장된 고객수
	//int size; 혼자 실험해본 거
	CustomerDAO() {
		customers = new Customer[5];
	}
	CustomerDAO(int size) {
//		this.size = size; 혼자 실험해본 거
		customers = new Customer[size];
	}
	void printInfo() {
		System.out.println("고객저장소의 크기 " + customers.length);
		System.out.println("저장된 고객수: " + count);
		System.out.println("남은 저장소 크기: " + (customers.length - count));
		for(int i = 0; i < count; i++) {
			Customer c = customers[i];
			System.out.print("[" + i + "] = ");
			c.printInfo();
		}
	}
	void add(Customer customer) {
		if(count >= customers.length) {
			System.out.println("저장소가 꽉 찼습니다.");
		}else {
			customers[count] = customer;
			count++;//Good Code
//			customers[count++] = customer;//Bad Code
		}
	}
	//TODO 완성하세요
}


public class CustomerManager {
	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAO(); //최대 5명이 저장될 저장소로 초기화
		
		Scanner sc = new Scanner(System.in);
		String readValue;
		do {
			System.out.println("아이디: ");
			String id = sc.nextLine();
			System.out.println("비밀번호: ");
			String pwd = sc.nextLine();
			System.out.println("이름: ");
			String name = sc.nextLine();
			System.out.println("주소: ");
			String address = sc.nextLine();
		
			Customer c1 = new Customer(id, pwd, name, address);
			dao.add(c1);
		
			System.out.println("종료하려면 quit을 입력하세요. 계속하려면 아무키를 눌러주세요.");
			readValue = sc.nextLine();
		}while(!readValue.equals("quit"));
		
		
//		Customer c1 = new Customer("id1", "p1", "n1", "a1");
//		dao.add(c1);//고객저장소의 0번 index에 c1객체 참조시킨다.
//		
//		Customer c2 = new Customer("id2", "p2", "n2", "a2");
//		dao.add(c2);//고객저장소의 1번 index에 c2 객체를 참조시킨다.
//
//		Customer c3 = new Customer("id3", "p3", "n3", "a3");
//		dao.add(c3);//고객저장소의 2번 index에 c3 객체를 참조시킨다.
//		
//		dao.add(new Customer("id4", "p4", "n4", "a4"));
//		dao.add(new Customer("id5", "p5", "n5", "a5"));
////		dao.add(new Customer("id6", "p6", "n6", "a6"));
////		dao.add(new Customer("id7", "p7", "n7", "a7"));
//		
		dao.printInfo();
		
//		dao = new CustomerDAO(10); //최대 10명이 저장될 저장소로 초기화
//		dao.printInfo();
	}

}
