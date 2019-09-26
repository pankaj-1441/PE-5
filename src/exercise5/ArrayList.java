package exercise5;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input: ");
         String s=sc.nextLine();
         String s1=s.substring(1,s.length()-1);
         String[] arr=s1.split(", ");

        List<String> list=new java.util.ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.print("Enter the index of element you want to replace: ");
        int n=sc.nextInt();
        System.out.print("Enter the new element : ");
        String r=sc.next();
        list.set(n,r);
        System.out.println(list.toString());
        System.out.print("Press 'd' to delete all the elements : ");
        String d=sc.next();
        if(d.equals("d")) {
            list.clear();
        }
        System.out.println(list.toString());



    }
}
