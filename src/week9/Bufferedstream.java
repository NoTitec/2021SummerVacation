package week9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Bufferedstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = null;
				PrintWriter out = null;
				try {
					in = new BufferedReader(new FileReader("in.txt"));
					out = new PrintWriter(new FileWriter("out.txt"));

					String s;
					while ((s = in.readLine()) != null) { //라인 단위 입력, EOF 검사
						out.println(s); //라인 단위 출력
					}
				} finally { 
					if (in != null) in.close( ); if (out != null) out.close( );
				}
		
	}

}
