package com.google;

import java.util.HashMap;
import java.util.Iterator;

public class FailFastIterator {

  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
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
