package linkedLists;

import java.util.*;
public class ak_42_MainLinkedList {
    public static void main(String[] args) {
    /*    List<Integer> ll =  new LinkedList<>();
        List<Integer> al = new ArrayList<>();

       *//* ll.add(12);
        ll.add(2);
        ll.add(15);

        System.out.println(ll.get(1));
        System.out.println(ll);*//*

        getTimeDiff(al);
        getTimeDiff(ll);
    }
    static void getTimeDiff(List<Integer> list){
        long start = System.currentTimeMillis();
        for(int i=0; i<100000;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName() + " "+(end-start));*/



       ak_42_MyLinkedList<String> myll = new ak_42_MyLinkedList();

       for(int i=0; i<10; i++){
           myll.add(i+"added");
       }
       myll.add(12+"added");
       myll.add(56+"added");

       myll.print();
    }
}
