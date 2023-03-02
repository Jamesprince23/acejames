package exercise7;

import java.io.File;

public class AllFilesAndDirectories {
	public static void main(String[] args) {
		File dirname = new File("/Users/jamesprince/eclipse-workspace/abc/src");
		if (dirname.isDirectory()) {
			String string[] = dirname.list();
			for (int i = 0; i < string.length; i++) {
				System.out.println(string[i]);
			}
		}

	}

}
