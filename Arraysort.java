public class Arraysort {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5};
        int arr[]={2,1,3,5,2};
        boolean isSorted=true ;   //asumme array is sorted
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
        }
        if(isSorted){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }
    }
}
