package week9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Charstreamcopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;

		// ��Ʈ�� ����
		in = new FileReader("C:\\��������\\rwŬ����.txt");
		out = new FileWriter("C:\\��������\\copy.txt");

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
