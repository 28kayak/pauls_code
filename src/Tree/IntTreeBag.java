package Tree;

//Paul Williams Diaz
//pauldiaz@my.smccd.edu
//Java Data Structures
//Project 5 Binary Search Tree
//Nov 7, 2013

//package inttreebagmain;
import java.util.*;
import java.io.*;

public class IntTreeBag implements Cloneable{
  
 private IntBTNode root;   
 
 public IntTreeBag()
 {
     this.root = null;
 }
 /**
 * Insert a new element into this bag.
 * @param <CODE>element</CODE>
 *   the new element that is being inserted
 * <dt><b>Postcondition:</b><dd>
 *   A new copy of the element has been added to this bag.
 * @exception OutOfMemoryError
 *   Indicates insufficient memory a new IntBTNode.
 **/
 public void add(int element){      
    IntBTNode cursor = root;
    IntBTNode node = new IntBTNode(element, null, null);
    boolean done = false;
    
    if(root == null){//creates the first node and it is the root
        root = new IntBTNode(element, null, null);
        System.out.println("element of root = " + element);
    }else{

        while(!done){
            if(element < cursor.getData())
            {//then focus on the left
                if(cursor.getLeft() == null)
                {//if null then creates a node
                    cursor.setLeft(node);
                    done = true;
                }else
                {//then continue going through node until cursor.getLeft == null
                    cursor = cursor.getLeft();
                }
            }else{//focus on the right
                if(cursor.getRight() == null)
                {
                    cursor.setRight(node);
                    done = true;
                }else{
                    cursor = cursor.getRight();
                }
            }
        }//end while   
    }   
 }
    /**
 * Determine the number of elements in this bag.
 * @param - none
 * @return
 *   the number of elements in this bag
 **/                           
 public int size( )
 {
    return IntBTNode.treeSize(root);
 }
 /**
 * Create a new bag that contains all the elements from two other bags.
 * @param <CODE>b1</CODE>
 *   the first of two bags
 * @param <CODE>b2</CODE>
 *   the second of two bags
 * <dt><b>Precondition:</b><dd>
 *   Neither b1 nor b2 is null.
 * @return
 *   the union of b1 and b2
 * @exception IllegalArgumentException
 *   Indicates that one of the arguments is null.
 * @exception OutOfMemoryError
 *   Indicates insufficient memory for the new bag.
 **/   
 public static IntTreeBag union(IntTreeBag b1, IntTreeBag b2){
    IntTreeBag newBag = new IntTreeBag();//creates a new bag
    
    if((b1 == null) || (b2 == null)){
        throw new IllegalArgumentException(" at least one bag is empty");
    }else{
        newBag = (IntTreeBag) b1.clone();
    }
    newBag.addAll(b2);
    
    return newBag;
 } 
 //method to print the whole tree
public void print()
{
    if (root == null )
    {
       System.out.println("This TreeBag is empty.");
    }else
    {
    	System.out.println("inordered");
        root.inorderPrint();
        
        System.out.println("preodered");
        root.preorderPrint();
        
        System.out.println("postodered");
        root.postorderPrint();
        
    }
}
   /**
 * Generate a copy of this bag.
 * @param - none
 * @return
 *   The return value is a copy of this bag. Subsequent changes to the
 *   copy will not affect the original, nor vice versa. Note that the return
 *   value must be type cast to an <CODE>IntTreeBag</CODE> before it can be used.
 * @exception OutOfMemoryError
 *   Indicates insufficient memory for creating the clone.
 **/ 
 @Override
 public Object clone( ){// Clone an IntTreeBag object.
     IntTreeBag answer = null;
   
     try{
         answer = (IntTreeBag) super.clone();
     }catch(CloneNotSupportedException e){
         System.out.println(e.toString());
     }
     answer.root = IntBTNode.treeCopy(root);
    return answer; 
 }
 /**
 * Add the contents of another bag to this bag.
 * @param <CODE>addend</CODE>
 *   a bag whose contents will be added to this bag
 * <dt><b>Precondition:</b><dd>
 *   The parameter, <CODE>addend</CODE>, is not null.
 * <dt><b>Postcondition:</b><dd>
 *   The elements from <CODE>addend</CODE> have been added to this bag.
 * @exception IllegalArgumentException
 *   Indicates that <CODE>addend</CODE> is null.
 * @exception OutOfMemoryError
 *   Indicates insufficient memory to increase the size of the bag.
 **/
 public void addAll(IntTreeBag addend){
     IntBTNode addroot;
     
     if(addend == null){
         throw new IllegalArgumentException(" bag is empty");
     }
     if(root == addend.root){
         addroot = IntBTNode.treeCopy(addend.root);
         addTree(addroot);
     }else{
         addTree(addend.root);
     }
 }
 //Precondition: addroot is a reference to the root of a binary search tree
 //that is separate from the binary search tree of the bag that activated this
 //this method.
 //Postcondition: All the elements from the addroot's binary search tree
 //have been added to the binary search tree of the bag that activated this
 //method
 private void addTree(IntBTNode addroot){
     if(addroot != null){
         add(addroot.getData());
         addTree(addroot.getLeft());
         addTree(addroot.getRight());
     }    
 }
 /**
 * Accessor method to count the number of occurrences of a particular element
 * in this bag.
 * @param <CODE>target</CODE>
 *   the element that needs to be counted
 * @return
 *   the number of times that <CODE>target</CODE> occurs in this bag
 **/
 public int countOccurrences(int target){
    IntBTNode cursor = root;
    int count = 0; 
    
    if(root == null){
        return 0;     
    }
    while(cursor != null){
        if(target < cursor.getData()){
            cursor = cursor.getLeft();
        }else if(target > cursor.getData()){
            cursor = cursor.getRight();
        }else{//means target and cursor.data are equal 
            count++;
            cursor = cursor.getLeft();   
      }
    }
    return count;
 }           
 /**
 * Remove one copy of a specified element from this bag.
 * @param <CODE>target</CODE>
 *   the element to remove from the bag
 * <dt><b>Postcondition:</b><dd>
 *   If <CODE>target</CODE> was found in the bag, then one copy of
 *   <CODE>target</CODE> has been removed and the method returns true. 
 *   Otherwise the bag remains unchanged and the method returns false. 
 **/
 private boolean remove(int target)
 {
    // Student will replace this return statement with their own code:
    return false;
 }       
}
         
