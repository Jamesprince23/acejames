package exercise;

public class sorting {
	public static void main(String[] args) {
		int arr[]= {5,7,2,1,6};
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					
				}
			}
		}
		for (int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
			
		}
	}

}
