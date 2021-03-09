package com.google;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

  public static void main(String[] args) {

    Map<Integer,String> map = new HashMap<>();
   map.put(1,"Srinu");
   map.put(2,"Uday");
    Thread t1 = new Thread(

        () -> {
          for(Integer key : map.keySet())
          {
            System.out.println("["+Thread.currentThread().getName()+"] =>"+ key + " : "+map.get(key));
          }
        }

    );

    Thread t2 = new Thread(

        () -> {
          for(Integer key : map.keySet())
          {
            System.out.println("["+Thread.currentThread().getName()+"] => "+ key + " : "+map.get(key));
            map.put(3,"Kavya");
          }
        }

    );

    t1.setName(" Thread - 01");
    t2.setName(" Thread - 02");

    t1.start();
    t2.start();



  }
}
