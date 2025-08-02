public class secondMax {
    public static void secondMax(int num[]){
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        if(num[0]>num[1]){
            max1=num[0];
            max2=num[1];
        }
        else{
            max2=num[0];
            max1=num[1];
        }
        for(int i=2;i<num.length;i++){
            if(num[i]>max1){
                max2=max1;
                max1=num[i];
            }
            else if(num[i]>max2){
                max2=num[i];
            
            }
        }
        System.out.println(" largest number is  " +max1 );
        System.out.println("second largest number is " +max2 );
    }
    public static void main(String[] args) {
        int num[]={23,30,42,21,38};
        secondMax(num);
    }
}
