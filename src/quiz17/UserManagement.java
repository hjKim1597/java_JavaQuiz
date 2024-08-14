package quiz17;

import java.util.ArrayList;
import java.util.List;

public class UserManagement implements IUserManagement {
	
	// 값을 저장할 리스트
	private List<UserVO> list = new ArrayList<>();
	
	// 회원정보 추가 메서드
	public void insert(String name, int age) {
		list.add(new UserVO(name, age));
	}
	
	// 회원정보 출력 메서드
	public void printList() {
		System.out.println("=========회원정보 출력========");
		for(int i = 0; i < list.size(); i++) {
			UserVO user = list.get(i);
			System.out.println("이름: " + user.getName() + ", 나이: " + user.getAge());
		}
	}
		
	// 회원정보 검색 메서드
	public boolean serach(String name) {
		
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			UserVO user = list.get(i);
			String n = user.getName();
			if(user.getName().equals(name)) {
				System.out.println(n + "님이 있습니다.");
				System.out.println("번호: " + i + "이름: " + user.getName() + ", 나이: " + user.getAge());
				flag = true; // if문 실행
			}
		}
		return flag;
	}
	
	// 회원정보 삭제 메서드
	public boolean delete(String name) {
		
		boolean flag = false;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(name)) { // 삭제할 이름을 찾음
				list.remove(i);
				System.out.println(name + "님의 회원정보를 삭제했습니다.");
				flag = true;
				break;
			}
		}
		return flag;
	}
}
