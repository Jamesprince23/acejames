package exercise;

public class findLocation {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int a=3;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a) {
				System.out.println(i);
			}
		}
	}

}
