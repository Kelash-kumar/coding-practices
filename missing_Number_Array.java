import java.util.Arrays;

public class missing_Number_Array {

   public static int missed_Number_Array(int[] array,int n){
  
        
    Arrays.sort(array);
   for(int i=0;i<n-1;i++)
    if((array[i+1]-array[i])>1)
        return array[i]+1;
   return -1;
}

   
    public static void main(String[] args) {
       int A[] = {6,1,2,8,3,4,7,10,5};
// missed_Number_Array(A,A.length);
System.out.println(missed_Number_Array(A, A.length));
    }
    
}
