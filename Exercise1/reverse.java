package exercise;

public class reverse {
	public static void main(String[] args) {
		int arr[]= {6,7,8,9,10};
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			int t=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=arr[i];
			arr[n-1-i]=t;
			
		}
		for (int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
