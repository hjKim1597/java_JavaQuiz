package quiz20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileQuiz02 {
	
	public static void main(String[] args) {
		/*
		 * 1. 빠른 입력을 통해서, 사용자로부터 입력을 받는다
		 * 2. 사용자가 "그만"을 적을 때까지 입력 받아주면 된다
		 * 3. 입력받을 내용을 BufferWriter를 이욯해서 파일을 써라 (파일명은 자유)
		 * 4. 단, 사용자가 엔터를 칠 때마다 데이터는 써져야 한다.
		 */
		
		/*
		 * inputStream, outputStream - 파일, 동영상 
		 * reader, writer - 문자열 글자
		 */
		
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello5.txt";
		
		BufferedWriter bw = null; // 입력
		BufferedReader br = null; // 출력
		
		try {
			
			bw = new BufferedWriter(new FileWriter(path)); // 파일로 쓴다
			br = new BufferedReader(new InputStreamReader(System.in)); // 사람한테 입력받는 걸 읽음
			// br = new BufferedReader(new FileReader(System.in)); // 파일을 읽음
			
			while(true) {
				System.out.println("입력> ");
				String str = br.readLine(); // nextLine()
				
				if(str.equals("그만")) {
					break;
				}
				bw.write(str+"\n"); // 파일로 쓰기
				bw.flush(); // 1번 입력할 때마다 글자가 써짐
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				bw.close();
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
