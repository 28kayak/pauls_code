
//package intarraybagmain;
import java.util.*;

public class IntArrayBagMain {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        IntArrayBag bag1 = new IntArrayBag(9);
        IntArrayBag bag2 = new IntArrayBag(9);
  
        bag1.add(10);
        bag1.add(20);
        bag1.add(30);
        bag1.add(40);
        bag1.add(4);
        bag1.add(50);
        bag1.add(90);
        
        bag2.add(4);
        bag2.add(90);
        bag2.add(60);
        bag2.add(5);
        bag2.add(70);
        bag2.add(10);
        bag2.add(20);
        
        System.out.println("IntArrayBag1: " + bag1);
        System.out.println("IntArrayBag2: " + bag2);
        
        System.out.println( "Intersection: " + IntArrayBag.intersection(bag1, bag2));
        
    }
}
