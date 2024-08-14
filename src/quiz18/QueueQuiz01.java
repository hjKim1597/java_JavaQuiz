package quiz18;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueQuiz01 {
	
	public static void main(String[] args) {
			
		Customer[] arr = {
				new Customer("hong", 5),
				new Customer("lee", 4),
				new Customer("john", 1),
				new Customer("홍길동씨", 6),
				new Customer("alen", 2)
		};
		
		// 은행에 번호표를 뽑아서 가지고 있는 랜덤한 Customer 배열입니다.
		// 번호표 순서대로 객체 출력
		// John -> alen -> lee -> hong -> 홍길동씨
		
		// 배열을 컬렉션으로 형변환
		Queue<Customer> queue = new PriorityQueue<>(); // 큐
	
//		List<Customer> customer = Arrays.asList(arr);
		queue.addAll(Arrays.asList(arr));
		
		// 큐를 소비
		while(queue.isEmpty() == false) { 
			System.out.println(queue.poll()); 
		}
	}
}