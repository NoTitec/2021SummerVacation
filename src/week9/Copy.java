package week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in = null;
		FileOutputStream out = null;

		// 스트림 생성
		in = new FileInputStream("C:\\\\연습파일\\\\rw클래스.txt");
		out = new FileOutputStream("C:\\연습파일2\\copy.txt");

		// 읽기/쓰기 연산 수행
		int c;
		
		while ((c = in.read()) != -1) {
			out.write(c);
		}

		// 스트림 닫기
		in.close();
		out.close();
	}

}
