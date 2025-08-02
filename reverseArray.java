public class reverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.print("Reverse of arry is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    
    }
}
