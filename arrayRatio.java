import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;

public class arrayRatio {
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
    
        
            double cp = 0, cn = 0, cz = 0;
         
           
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) > 0) {
                    cp++;
                } else if (arr.get(i) < 0) {
                    cn++;
                } else {
                    cz++;
                }
    
            }
            double x = cp / arr.size();
            double y = cn / arr.size();
            double z = cz / arr.size();
    
            Formatter fmp = new Formatter();
            // Format 4 decimal places
            fmp.format("%.6f", x);
            System.out.println(fmp);
            fmp.close();
    
            Formatter fmn = new Formatter();
            fmn.format("%.6f", y);
            System.out.println(fmn);
            fmn.close();
    
            Formatter fmz = new Formatter();
            fmz.format("%.6f", z);
            System.out.println(fmz);
            fmz.close();
    
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        ArrayList <Long> sumList=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
        Long sum=0L;
        for(int j=0;j<arr.size();j++)
        {
            if(i==j)continue;

            else{
                sum+=arr.get(j);
            }
        }

        sumList.add(sum);
    }

    Collections.sort(sumList);
   System.out.println(sumList.get(0)+"  "+sumList.get(sumList.size()-1));
        }
    
    public static void main(String[] args) {
ArrayList <Integer> arr=new ArrayList<>();
arr.add(396285104);
arr.add(573261094);
arr.add(759641832);
arr.add(819230764 );
arr.add(364801279);
// plusMinus(arr);
miniMaxSum(arr);
    }
}
