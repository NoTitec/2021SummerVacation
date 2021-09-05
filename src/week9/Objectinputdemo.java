package week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class Objectinputdemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream ois = 
				new ObjectInputStream( new FileInputStream("C:\\\\연습파일\\\\aa.txt") );
				// new ObjectInputStream(new BufferedInputStream(new FileInputStream(args[0])))

			// primitiv-type 값 읽기 (주의) write한 순서대로 read.
			System.out.println( ois.readChar() );		
			System.out.println( ois.readBoolean() );	
			System.out.println( ois.readDouble() );	
			System.out.println( ois.readUTF() );		

			// 객체 읽기; 타입변환 時 ClassNotFoundException 발생 가능.
			System.out.println( (Date)ois.readObject() );	

			// 3. 스트림 닫기
			ois.close();
	}

}
