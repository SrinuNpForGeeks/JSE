package com.google;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

  public static void main(String[] args) {
    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
    map.put(1, "Srinu");
    map.put(2, "Kalyan");

    Iterator<Integer> itr = map.keySet().iterator();
    while (itr.hasNext()) {
      Integer key = itr.next();
      System.out.println(key + " : " + map.get(key));
      map.put(3, "Kayva");
    }
  }

}
