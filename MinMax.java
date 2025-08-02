public class MinMax{
    public static int findMax(int num[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }

     public static int findMin(int num[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int num[]={2,4,6,8,10,100000};
        System.out.println("Maximum is "+findMax(num));
        System.out.println("Minimum is "+findMin(num));
    }
}