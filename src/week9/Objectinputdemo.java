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
				new ObjectInputStream( new FileInputStream("C:\\\\��������\\\\aa.txt") );
				// new ObjectInputStream(new BufferedInputStream(new FileInputStream(args[0])))

			// primitiv-type �� �б� (����) write�� ������� read.
			System.out.println( ois.readChar() );		
			System.out.println( ois.readBoolean() );	
			System.out.println( ois.readDouble() );	
			System.out.println( ois.readUTF() );		

			// ��ü �б�; Ÿ�Ժ�ȯ �� ClassNotFoundException �߻� ����.
			System.out.println( (Date)ois.readObject() );	

			// 3. ��Ʈ�� �ݱ�
			ois.close();
	}

}
