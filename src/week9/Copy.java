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

		// ��Ʈ�� ����
		in = new FileInputStream("C:\\\\��������\\\\rwŬ����.txt");
		out = new FileOutputStream("C:\\��������2\\copy.txt");

		// �б�/���� ���� ����
		int c;
		
		while ((c = in.read()) != -1) {
			out.write(c);
		}

		// ��Ʈ�� �ݱ�
		in.close();
		out.close();
	}

}
