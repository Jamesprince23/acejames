package exercise7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyImage {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(InputStream in=new FileInputStream("/Users/jamesprince/eclipse-workspace/abc/src/exercise7/virat.jpg");
			OutputStream out=new FileOutputStream("/Users/jamesprince/eclipse-workspace/abc/src/exercise7/dhoni.jpg")){
			byte[] buffer=new byte[1024];
			int bytesRead;
			while((bytesRead=in.read(buffer))!=-1) {
				out.write(buffer,0,bytesRead);
				
			}
			for(int i=0;i<buffer.length;i++) {
				System.out.println(buffer[i]+" ");
			}
			System.out.println("Image copied");
		}catch(Exception e) {
			e.printStackTrace();
			
			
			
		}
	}

}
