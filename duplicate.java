public class duplicate {
    public static boolean containDuplicate(int num[]){
        for (int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;         //duplicate found
                }
            }
        }
        return false ;    //duplicate not found
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        System.out.println(containDuplicate(num));
    }
}
