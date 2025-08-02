public class maxElement {
    public static void main(String args[]){
        int arr[]={10,27,61,43,17};
        int max=arr[0];//assume that first elemt is max
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max element is = "+max);
    }
}
