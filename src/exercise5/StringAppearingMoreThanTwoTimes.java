package exercise5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringAppearingMoreThanTwoTimes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter different strings with spaces : ");
        String line=sc.nextLine();
        String[] arr=line.split(" ");
        Map<String, Integer> map=new LinkedHashMap<>();
        for(String str : arr){
            Integer n=map.get(str);
            if(n==null){
                n=1;
            }
            else n++;

            map.put(str,n);
        }
        Map<String,Boolean> res=new LinkedHashMap<>();
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
           if(entry.getValue()>1){
               res.put(entry.getKey(),true);
           }
           else res.put(entry.getKey(),false);
        }
        for(Map.Entry<String,Boolean> myentry : res.entrySet()){
            System.out.print(myentry.getKey()+" : "+myentry.getValue()+"  ");
        }
    }
}
