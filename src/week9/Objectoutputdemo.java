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
				new ObjectOutputStream( new FileOutputStream("C:\\��������\\aa.txt" ));
				// new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(args[0])))

			// primitive-type �� ����
			oos.writeChar('1');
			oos.writeBoolean(true);
			oos.writeDouble(100.0);
			oos.writeUTF("abc");

			// ��ü ���� (����) Serializable ��ü�� ���� ����.
			oos.writeObject( new Date() ); 

			// ��Ʈ�� �ݱ�
			oos.close();
	}

}
