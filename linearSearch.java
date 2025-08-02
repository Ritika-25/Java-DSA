public class linearSearch {
    public static void main(String[] args) {
        int arr[]={12,32,42,53,23,13,34};
        int key=53;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("element found " + key + " at index "+ i);
                 found=true;
                break;
            
            }
        }
        if(!found){
                System.out.println("elemnt not found");
    }
}
}


