import java.util.Arrays;
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
	void printDBInfo() {
		System.out.println("고객저장소의 크기 " + customers.length);
		System.out.println("저장된 고객수: " + count);
		System.out.println("남은 저장소 크기: " + (customers.length - count));
	}
	void printCutomerInfo() {//변경필요
		Customer all[] = new Customer[count];
		for(Customer c : all) {
			c.printInfo();
		}
//		for(int i = 0; i < count; i++) {
//			Customer c = customers[i];
//			System.out.print("[" + i + "] = ");
//			c.printInfo();
//		}
	}
	/**
	 * 
	 * @param add
	 */
	void add(Customer customer) {
		if(count >= customers.length) {
			System.out.println("저장소가 꽉 찼습니다.");
		}else {
			customers[count] = customer;
			count++;//Good Code
//			customers[count++] = customer;//Bad Code
		}
	}
	//CustomerDAO의 findAll()입니다
	Customer[] findAll(){    //Customer[]all = dao.findAll();로 사용한다
			//return customers;
			Customer all[] = new Customer[count];
//			for(int i=0; i<count; i++) {
//				all[i] = customers[i];
//			}
			System.arraycopy(customers, 0, all, 0, count);
			return all;
	}
//	Customer[] findID() {
//		Customer ID[] = new Customer[count];
//		Scanner sc1 = new Scanner(System.in);
//		String searchID;
//		System.out.print("검색할 아이디: ");
//		searchID = sc1.nextLine();
//		Arrays.stream(ID).anyMatch(searchID::equals);
//		return 
//	}
	Customer findById(String id) {
		for(int i=0; i<count; i++) {
//			Customer c = customers[i];
//			String cId = c.id;//저장된 고객ID
//			if(cId.equals(id)) {
//				return c;
//			}이걸 축약, 간단히 표현하면 아래가 된다.
			if(customers[i].id.equals(id)) {
				return customers[i];
			}
		}
//		System.out.println(id + "고객은 존재하지 않습니다.");
		return null;
	}
	
	//Customer c = dao.findById(id);로 사용한다.
//	Customer[] findByName(String word) {//Customer[] cArr = dao.findByName(word);로 사용한다.
//		int wordCnt = 0;//단어를 포함한 고객수
//		Customer cArr[] = new Customer[count];
//		for(int i = 0; i < count; i++) {
//			Customer c = customers[i];
//			String cName = c.name;//저장된 고객이름
//			if(cName.contains(word)) {
//				wordCnt++;
//				return cArr;
//			}
//		}
//		return null;
//	}
	Customer[] findByName(String word){//Customer[] cArr = dao.findByName(word);로 사용한다
//		int wordCnt = 0; //단어를 포함한 고객수
//		for(int i=0; i<count; i++) {
//			Customer c = customers[i];
//			String cName = c.name; //저장된 고객이름
//			if(cName.contains(word)) { //if(cName.contains(word)==true){
//				wordCnt++;
//			}
//		}
//		
//		Customer []cArr = new Customer[wordCnt];
//		int cArrIndex = 0;
//		for(int i=0; i<count; i++) {
//			Customer c = customers[i];
//			String cName = c.name; //저장된 고객이름
//			if(cName.contains(word)) { //if(cName.contains(word)==true){
//				cArr[cArrIndex] = c;
//				cArrIndex++;
//			}
//		}
		
		Customer []cArr1 = new Customer[count];
		int cArrIndex = 0;
		for(int i=0; i<count; i++) {
			Customer c = customers[i];
			String cName = c.name;
			if(cName.contains(word)) {
				//cArr1[i] = c; //이부분이 오타. 아래코드로 바꿈
				cArr1[cArrIndex] = c; 
				cArrIndex++;
			}
		}
		//Customer []cArr =  new Customer[cArrIndex];//null값을 반환하거나 참조값을 반환해야하니까 먼저 null로 초기화
		Customer []cArr = null;
		if(cArrIndex > 0) { 
			cArr = new Customer[cArrIndex];
			System.arraycopy(cArr1, 0, cArr, 0, cArrIndex);
		}
		return cArr;
	}
	void modify(Customer c) {
		Customer c1 = findById(c.id);//c1 저장소의 고객
		boolean flag = false;
		if(c1 != null) {
			if(!"".equals(c.pwd)) {
				c1.pwd = c.pwd;
				flag = true;
			}
			if(!"".equals(c.name)) {
				c1.name = c.name;
				flag = true;
			}
			if(!"".equals(c.address)) {
				c1.address = c.address;
				flag = true;
			}
		}
		if(flag) {
			System.out.println("고객정보가 변경되었습니다.");
		}else {
			System.out.println("고객정보가 변경되지않았습니다.");
		}
	}
//	boolean modify(Customer c){
//		Customer c1 = findById(c.id); //c1: 저장소의 고객
//		if(c1 != null) {
//			boolean flag = false;
//			if(!"".equals(c.pwd)) {
//				c1.pwd = c.pwd;
//				flag = true;
//			}
//			if(!"".equals(c.name)) {
//				c1.name = c.name;
//				flag = true;
//			}
//			if(!"".equals(c.address)) {
//				c1.address = c.address;
//				flag = true;
//			}
//			return flag;
//		}
//		return false;
//	}

	//TODO 완성하세요
}

public class CustomerManager {
	public static void main(String[] args) {
		CustomerDAO dao = new CustomerDAO(); //최대 5명이 저장될 저장소로 초기화
		
		Scanner sc = new Scanner(System.in);
		String readValue;
		do {
			System.out.println("작업 구분: 1 - 고객 추가, 2 - 저장소 정보, 3 - 고객 전체 조회, 4 - 아이디로 검색, 5 - 이름으로 검색, 6 - 고객 수정, 9 - 종료");
			System.out.print("작업을 선택하세요: ");
			readValue = sc.nextLine();
			if("1".equals(readValue)) {
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
				System.out.println("고객 추가 성공");
				continue;
			}else if("2".equals(readValue)) {
				System.out.println(">>저장소 정보<<");
				dao.printDBInfo();
				continue;
			}else if("3".equals(readValue)) {
				System.out.println(">>고객 전체 조회<<");
				//dao.printCutomerInfo();
				Customer all[] = dao.findAll();
				for(Customer c: all) {
					c.printInfo();
				}
				continue;
			}else if("4".equals(readValue)) {
				System.out.println(">>아이디로 검색<<");
				System.out.print("아이디: ");
				String id = sc.nextLine();//switch문에서는 {}를 사용하지 않기때문에 switch문 안에서 쓴 변수는 자료형 선언없이 재사용이 가능하다
				Customer c = dao.findById(id);
				if(c == null) {
					System.out.println(id + "고객은 존재하지 않습니다.");
				}else {
					c.printInfo(); 
				}
				continue;
			}else if("5".equals(readValue)) {
				System.out.println(">>이름으로 검색<<");
				System.out.print("단어: ");
				String word = sc.nextLine();
				Customer cArr[] = dao.findByName(word);
				if(cArr == null) {
					System.out.println("단어[" + word + "]를 이름에 포함한 고객은 존재하지 않습니다.");
				}else {
					for(Customer c2 :cArr) {
						c2.printInfo();
					}
				}
				continue;
			}else if("6".equals(readValue)) {
				System.out.println(">>고객 수정<<");
				System.out.print("아이디: ");
				String id = sc.nextLine();
				Customer c6 = dao.findById(id);
				if(c6 == null) {
					System.out.println(id + "고객은 존재하지 않습니다.");
				}else {
					c6.printInfo();
					System.out.println("변경을 원치 않으시면 enter를 입력하고, 변경하려면 값을 입력하세요.");
					//System.out.println("입력된 비번값: " + c6Pwd);
					System.out.print("비밀번호 [" + c6.pwd + "]: ");
					String c6Pwd = sc.nextLine();
					System.out.print("이름 [" + c6.name + "]: ");
					String c6Name = sc.nextLine();
					System.out.print("주소 [" + c6.address + "]: ");
					String c6Address = sc.nextLine();
					Customer c6Modify = new Customer(id, c6Pwd, c6Name, c6Address);
					dao.modify(c6Modify);
				}
				continue;
			}else if("7".equals(readValue)) {
				System.out.println(">>고객정보삭제<<");
				System.out.println("삭제할 고객의 아이디: ");
				String id = sc.nextLine();
				Customer c7 = dao.findById(id);
				
				continue;
			}else if("9".equals(readValue)) {
				System.out.println("시스템을 종료합니다.");
				System.exit(0);
			}
		} while(!"9".equals(readValue));
		
//		do {
//			System.out.println("아이디: ");
//			String id = sc.nextLine();
//			System.out.println("비밀번호: ");
//			String pwd = sc.nextLine();
//			System.out.println("이름: ");
//			String name = sc.nextLine();
//			System.out.println("주소: ");
//			String address = sc.nextLine();
//		
//			Customer2 c1 = new Customer2(id, pwd, name, address);
//			dao.add(c1);
//		
//			System.out.println("종료하려면 quit을 입력하세요. 계속하려면 아무키를 눌러주세요.");
//			readValue = sc.nextLine();
//		}while(!readValue.equals("quit"));
//		
		
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
		dao.printDBInfo();
		
//		dao = new CustomerDAO(10); //최대 10명이 저장될 저장소로 초기화
//		dao.printInfo();
	}

}

