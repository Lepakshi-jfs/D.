package Pranavi;

public class TestArray {

	public static void main(String[] args) {
		int arr1[]=new int[5];
		int arr2[]={1,2,3,4,5};
		for(int i=0;i<5;i++)
			arr1[i]=i+2;
		for(int i=0;i<5;i++)
			System.out.println(arr1[i]+" "+arr2[i]);

	}

}
