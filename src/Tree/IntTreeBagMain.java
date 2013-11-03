package Tree;

//Paul Williams Diaz
//pauldiaz@my.smccd.edu
//Java Data Structures
//Project 5 Binary Search Tree
//Nov 7, 2013

//package inttreebagmain;
import java.util.*;

public class IntTreeBagMain {

  public static void main(String[] args) {
      IntTreeBag tree1 = new IntTreeBag();
      IntTreeBag tree2 = new IntTreeBag();
      IntTreeBag tree3 = new IntTreeBag();
      
      tree1.add(55);
      tree1.add(50);
      tree1.add(8);
      tree1.add(61);
      tree1.add(100);
      tree1.add(2);
      tree1.add(2);
      tree1.add(2);
      
      System.out.println("Bag 1");
      tree1.print();
      System.out.println("occurrence = " + tree1.countOccurrences(2));
      
      /**
      tree2.add(60);
      tree2.add(70);
      tree2.add(600);
      tree2.add(6);
      tree2.add(100);
      
      System.out.println("\nBag 2");
      tree2.print();
      
      tree3 = (IntTreeBag) tree1.clone();
      System.out.println("\nBag 3 Clone");
      tree3.print();
      
      System.out.println("\nAddAll tree1 and tree2");
      tree1.addAll(tree2);
      tree1.print();
      **/
  }
}
