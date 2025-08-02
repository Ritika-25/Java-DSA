public class reverseArray {
    public static void reverseArray(int num[]){
        int start=0;          //start index
        int end=num.length-1;       //end index
        while (start<end) {
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
            
        }
        System.out.println("Reversed array: ");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        reverseArray(num);
    }
}
