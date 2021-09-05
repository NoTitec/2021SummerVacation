package week9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Objectoutputdemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = 
				new ObjectOutputStream( new FileOutputStream("C:\\연습파일\\aa.txt" ));
				// new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(args[0])))

			// primitive-type 값 쓰기
			oos.writeChar('1');
			oos.writeBoolean(true);
			oos.writeDouble(100.0);
			oos.writeUTF("abc");

			// 객체 쓰기 (주의) Serializable 객체만 쓰기 가능.
			oos.writeObject( new Date() ); 

			// 스트림 닫기
			oos.close();
	}

}
