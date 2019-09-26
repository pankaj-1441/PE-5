package exercise5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UseGenerics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter key,value pair-1 : ");
        String pair1=sc.nextLine();
        System.out.print("Enter key,value pair-2 : ");
        String pair2=sc.nextLine();
        String[] s1=pair1.split(",");
        String[] s2=pair2.split(",");
        Map<String,String> map=new LinkedHashMap<>();
        map.put(s1[0],s1[1]);
        map.put(s2[0],s2[1]);

        System.out.println("Map Before : ");
        System.out.println(map.toString());
        System.out.println();

        int count=0;
        String s=map.get(s1[0]);
        for(Map.Entry<String,String> entry : map.entrySet())
        {
            if(count==0){
                entry.setValue(" ");
            }
            else entry.setValue(s);
            count++;
        }
        System.out.println("Map After : ");


        System.out.println(map.toString());

    }
}
