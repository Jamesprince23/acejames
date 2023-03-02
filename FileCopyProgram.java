package exercise7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopyProgram {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileReader reader =new FileReader("/Users/jamesprince/eclipse-workspace/abc/src/exercise7/source.txt");
			FileWriter writer =new FileWriter("/Users/jamesprince/eclipse-workspace/abc/src/exercise7/destination.txt")){
			int a;
			while((a=reader.read())!=-1) {
				writer.write(a);
			}
			System.out.println("file copied");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
