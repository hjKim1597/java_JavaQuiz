package quiz17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {
	
	public static void main(String[] args) {
		
		// 간단한 회원정보 관리 프로그램
		
		Scanner scan = new Scanner(System.in);
		// 값을 저장할 리스트
		
		// 유저를 관리할 클래스
		IUserManagement manage = new UserManagement(); // 인터페이스를 끼고 호출
//		List<UserVO> list = new ArrayList<>();
		
		while(true) {
			System.out.println("-----------------------");
			System.out.println("[1.회원등록 2.회원전체보기 3.회원정보찾기 4.회원정보삭제 5.프로그램종료]");
			System.out.print("메뉴> ");
			int menu = scan.nextInt();
			
			
			// 메뉴에 따라서 기능을 나눔
			if(menu == 1) {
				// 스캐너로 이름과 나이를 입력받아서 User 객체에 저장하고 리스트에 하나 추가
				System.out.print("이름을 입력하세요> ");
				String name = scan.next();
				System.out.print("나이를 입력하세요> ");
				int age = scan.nextInt();			
				
				// 메서드 호출
				manage.insert(name, age);
//				list.add(new UserVO(name, age));
//				System.out.println("회원 등록되셨습니다.");
			}
			else if(menu == 2) {
				// 리스트 안에 저장된 모든 회원 정보를 반복문으로 출력
//				for(int i = 0; i < list.size(); i++) {
//					UserVO user = list.get(i);
//					System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
//				}
				manage.printList();
			}
			else if(menu == 3) {
				// 스캐너로 찾을 이름을 입력받아서 이름이 있다면 이름과 나이를 출력한다
				// 단, 찾는 이름이 없으면 "~~~님은 없습니다"를 출력한다
				System.out.println("검색할 이름> ");
				String name = scan.next();
				boolean flag = manage.serach(name);
//				boolean flag = false;
//				for(int i = 0; i < list.size(); i++) {
//					UserVO user = list.get(i);
//					String n = user.getName();
//					if(user.getName().equals(name)) {
//						System.out.println(n + "님이 있습니다.");
//						System.out.println("번호: " + i + "이름: " + user.getName() + ", 나이: " + user.getAge());
//						flag = true; // if문 실행
//					}
//				}
				if( !flag ) {
						System.out.println(name + "님은 없습니다.");
				}
			}
			else if(menu == 4) { 
				// 삭제할 이름을 입력받아서 이름과 동일한 User 객체를 삭제
				// 단, 첫 번째로 발견되는 User만 삭제
				System.out.println("삭제할 이름> ");
				String name = scan.next();
				boolean flag = manage.delete(name);
//				boolean flag = false; 
//				for(int i = 0; i < list.size(); i++) {
//					if(list.get(i).getName().equals(name)) {
//						list.remove(i);
//						System.out.println(name + "님의 회원정보를 삭제했습니다.");
//						flag = true;
//						break;
//					}
//				}
				if( !flag ) { // flag 변수가 거짓이 아니면 
					System.out.println("삭제할 이름이 없습니다.");
				}
			}
			else if(menu == 5) {
				System.out.println("프로그램이 종료됩니다.");
				break;
			}
		}
	}
}
