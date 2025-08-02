public class secondLargest {
    public static void main(String[] args) {
        int arr[]={22,32,29,49,21,40,50};
        int largest=Integer.MIN_VALUE;             //check for samllest value i.e -infinity
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){                 //checks if arr[i] is large that the current value
                secondlargest=largest;          //if arr[i] is largest than the curent largest then largest =secondlargest
                largest =arr[i];                //and upadte largest
                 
            }
            else if(arr[i]>secondlargest&&arr[i]!=largest){        //if arr[i] is not large than curr large but large 
                secondlargest=arr[i];                             //than seclarge then update only secondlarge
            }
        }
        System.out.println("second largest is "+secondlargest);
    }
}
