package week9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Charstreamcopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;

		// 스트림 생성
		in = new FileReader("C:\\연습파일\\rw클래스.txt");
		out = new FileWriter("C:\\연습파일\\copy.txt");

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
