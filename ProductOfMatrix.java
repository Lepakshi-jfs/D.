package Pranavi;

public class ProductOfMatrix {

	public static void main(String[] args) {
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		int arr3[][]=new int[3][3];
		//int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				arr1[i][j]=i+j;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				arr2[i][j]=i+j;		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			
				for(int k=0;k<3;k++)
					arr3[i][j]+=(arr1[i][k]*arr2[k][j]);
		}for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
				
				System.out.print(arr3[i][j]+" ");
			System.out.println();
			}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr1[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				System.out.print(arr2[i][j]+" ");
			System.out.println();
		}
		
	}

}
