package org.mm;

import java.util.ArrayList;


import java.util.*;

   @SuppressWarnings("rawtypes")
public class UserBO  {
      public static void main(String[] args) {

     
      ArrayList arrlist = new ArrayList();

      // use add() method to add values in the list
      arrlist.add(10);
      arrlist.add(12);
      arrlist.add(31);

      // print the list
      System.out.println("The list:" + arrlist);

      // removing range of 1st 2 elements
      arrlist.removeRange(0,2);
      System.out.println("The list after using removeRange:" + arrlist);
   }
}
}
