package exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string : ");
        String line=sc.nextLine();
        Pattern p=Pattern.compile("[a-zA-Z]+");
        Matcher m=p.matcher(line);
        Map<String,Integer> map=new HashMap<>();

         while(m.find()){
             String str=line.substring(m.start(),m.end());
            Integer n=map.get(str);
             if(n==null){
                 n=1;
             }
             else n++;
             map.put(str,n);
         }

        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.print(entry.getKey()+" : "+entry.getValue());
        }


    }
}
