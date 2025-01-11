package Lec_01;

public class Maximum_Sum_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1,-2,-3,-4};
		int max=Integer.MIN_VALUE;
		int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
//        return max;
	}

}
