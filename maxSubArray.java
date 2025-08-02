public class maxSubArray{
    public static void maxSubArray(int num[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<num.length;i++){
            currsum=currsum+num[i];
            if(currsum<0){
                currsum=0;
            }
            max=Math.max(currsum, max);
        }
        System.out.println("max subarray sum is: "+max);
    }
    public static void main(String[] args) {
        int num[]={-1,-3,4,-1,-2,1,5,-3};
        maxSubArray(num);
    }
}
