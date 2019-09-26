package exercise5;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter names you want to sort in a line with spaces : ");
        String line =sc.nextLine();
        String[] arr=line.split(" ");
        Set<String> set=new TreeSet<>();
        for(String s : arr){
            set.add(s);
        }
        List<String> list= new ArrayList<>();
        for(String s : set){
            list.add(s);
        }
        System.out.println(list.toString());
    }
}
