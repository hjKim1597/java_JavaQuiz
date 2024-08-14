package quiz20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class FileQuiz01 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 스캐너로 읽을 파일명을 확장자 포함 입력받습니다.
		 * 2. upload 폴더에 파일이 있다면 이 파일을 uploadcopy로 복사해주세요
		 *    파일이 없으면 "파일명이 없습니다" 예외 구문을 출력합니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("파일 이름> ");
		String s = scan.next();
		
		String inputpath = "C:\\Users\\user\\Desktop\\course\\java\\upload\\" + s;
		String outputpath = "C:\\Users\\user\\Desktop\\course\\java\\uploadcopy\\" + s;
		
		InputStream ios = null;
		OutputStream fos = null;
		
		try { 
			ios = new FileInputStream(inputpath);
			fos = new FileOutputStream(outputpath);
			
			byte[] arr = new byte[100];
			
			int result;
			while((result = ios.read(arr)) != -1) {
				fos.write(arr, 0, result);
			}	
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 없습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				ios.close();
				fos.close();
			} catch (Exception e2) {
			}
		}	
	}
}
