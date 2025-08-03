public class duplicate{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2};
        int n=arr.length;

        int unique[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++){
            boolean isduplicate =false;
        

        for (int j=0;j<n;j++){
            if(arr[i]==unique[j]){
                isduplicate=true;
                break;
            }
        }
            if (!isduplicate) {
                unique[index] = arr[i];
                index++;

        }
    }
     System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(unique[i] + " ");
}
    }
}