package exercise;

import java.util.Arrays;

public class resize {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,4,5,5};
		int newarr[]=Arrays.copyOf(arr, 10);
		System.out.println(newarr[1]);
				
	}

}
