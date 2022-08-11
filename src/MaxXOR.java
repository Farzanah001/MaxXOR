import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxXOR {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int max1,max2;
        System.out.println("Enter the Array Size:");
        int n=s.nextInt();
        ArrayList<Integer> xorlist=new ArrayList<>();
        System.out.println("Enter the Array Elements:");
        for(int i=1;i<=n;i++){
            xorlist.add(s.nextInt());
        }
//        max1= Collections.max(xorlist);
//
//        xorlist.remove(max1);
//        System.out.println(xorlist);
//        max2= Collections.max(xorlist);
//
//        int result=max1^max2;
//        System.out.println(result);
//        int xormax = n == 1 ? xorlist.get(0) ^ xorlist.get(1) : xorlist.get(0);
//        int j=0;
//        for(int i=0;i<xorlist.size();i++){
//            int xorsum=xorlist.get(i)^xorlist.get(j);
//            if(xorsum>xormax){
//                xormax=xorsum;
//                if(xorlist.get(i)>xorlist.get(j)){
//                    j=i;
//                }
//            }
//        }
        int xorval=0,xorsum=0;
        int num1=0,num2=0;
        for(int i=0;i<xorlist.size();i++){
            for(int j=i+1;j<xorlist.size()-1;j++){
                xorsum=xorlist.get(i)^xorlist.get(j);
                if(xorsum==0||xorsum>xorval){
                    xorval=xorsum;
                    num1=xorlist.get(i);
                    num2=xorlist.get(j);
                }
            }
        }
        System.out.println(num1+" "+num2);
        System.out.println(xorval);
    }
}