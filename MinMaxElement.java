public class MinMaxElement {
    public static void main(String[] args) {
        int arr[]={12,32,43,2,34,10};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Maximum element is = "+max);
        System.out.println("Minimum element is = "+min);
    }
}
