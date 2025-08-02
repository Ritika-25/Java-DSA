import java.util.*;
public class minElement {
    public static void main(String args[]){
        int arr[]={10,23,12,9,24};
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is = "+min);
    }
}
