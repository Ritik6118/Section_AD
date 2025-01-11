package Lec_01;

public class sum_of_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
//				System.out.println(sum);
				max=Math.max(max, sum);
			}
		}
		System.out.println(max); 
	}

}
