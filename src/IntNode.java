//package intnodemain;

public class IntNode
{

   private int data;
   private IntNode link;   
   
   public IntNode(int initialData, IntNode initialLink)
   {
      data = initialData;
      link = initialLink;
   }

   public void addNodeAfter(int item)   
   {
      link = new IntNode(item, link);
   }          
   
   public int getData( )   
   {
      return data;
   }

   public IntNode getLink( )
   {
      return link;                                               
   } 
    
   public static IntNode listCopy(IntNode source)
   {
      IntNode copyHead;
      IntNode copyTail;
      
      // Handle the special case of the empty list.
      if (source == null)
         return null;
         
      // Make the first node for the newly created list.
      copyHead = new IntNode(source.data, null);
      copyTail = copyHead;
      
      // Make the rest of the nodes for the newly created list.
      while (source.link != null)
      {
         source = source.link;
         copyTail.addNodeAfter(source.data);
         copyTail = copyTail.link;
      }
 
      // Return the head reference for the new list.
      return copyHead;
   }
   
   public static IntNode[ ] listCopyWithTail(IntNode source)
   {
      IntNode copyHead;
      IntNode copyTail;
      IntNode[ ] answer = new IntNode[2];
     
      // Handle the special case of the empty list.   
      if (source == null)
         return answer; // The answer has two null references .
      
      // Make the first node for the newly created list.
      copyHead = new IntNode(source.data, null);
      copyTail = copyHead;
      
      // Make the rest of the nodes for the newly created list.
      while (source.link != null)
      {
         source = source.link;
         copyTail.addNodeAfter(source.data);
         copyTail = copyTail.link;
      }
      
      // Return the head and tail references.
      answer[0] = copyHead;
      answer[1] = copyTail;
      return answer;
   }
     
   public static int listLength(IntNode head)
   {
      IntNode cursor;
      int answer;
      
      answer = 0;
      for (cursor = head; cursor != null; cursor = cursor.link)
         answer++;
        
      return answer;
   }
     
   public static IntNode[ ] listPart(IntNode start, IntNode end)
   {
      IntNode copyHead;
      IntNode copyTail;
      IntNode cursor;
      IntNode[ ] answer = new IntNode[2];
      
      // Make the first node for the newly created list. Notice that this will
      // cause a NullPointerException if start is null.
      copyHead = new IntNode(start.data, null);
      copyTail = copyHead;
      cursor = start;
      
      // Make the rest of the nodes for the newly created list.
      while (cursor != end)
      {
         cursor = cursor.link;
         if (cursor == null)
            throw new IllegalArgumentException
            ("end node was not found on the list");
         copyTail.addNodeAfter(cursor.data);
         copyTail = copyTail.link;
      }
      
      // Return the head and tail references
      answer[0] = copyHead;
      answer[1] = copyTail;
      return answer;
   }        
   
   public static IntNode listPosition(IntNode head, int position)
   {
      IntNode cursor;
      int i;
      
      if (position <= 0)
           throw new IllegalArgumentException("position is not positive");
      
      cursor = head;
      for (i = 1; (i < position) && (cursor != null); i++)
         cursor = cursor.link;

      return cursor;
   }
  
   public static IntNode listSearch(IntNode head, int target)
   {
      IntNode cursor;
      
      for (cursor = head; cursor != null; cursor = cursor.link)
         if (target == cursor.data)
            return cursor;
        
      return null;
   }

   public void removeNodeAfter( )   
   {
      link = link.link;
   }          
 
   public void setData(int newData)   
   {
      data = newData;
   }                                                               
   
   public void setLink(IntNode newLink)
   {                    
      link = newLink;
   }
   
   public static void insertAtPos(IntNode head, int pos, int value)
   {
       IntNode ptr = head;
       IntNode position;
      // IntNode newnode = new IntNode(value, head);
       
       position = listPosition(head, pos);
       if(position.link != null)
       {//when put new node between required place and its next.
    	   IntNode newNode = new IntNode(value, position.link);
    	   System.out.println("inside of method if is true");
    	   System.out.println(newNode.toString());
    	   
    	   
    	   
       }
       else
       {//required place is not in between
    	   position.addNodeAfter(value);
       }
    	  
       
       
       System.out.println("inside of inserAtPos");
       System.out.println(position.toString());
       System.out.println("end");
       

      /**
       if(pos <= 0)
       {
           throw new IllegalArgumentException(" position is less than 1.");
       }
       else
       {
    	   
    	   
            if(ptr != null){
                
                ptr = ptr.getLink(); 
            }
       }   
       */
   }//insertAtPost
   
   public String toString()
   {
	   if(this.link==null)
	   {
		   return "(deta:" + String.valueOf(data)+ ", link: null";
	   }
	   else
	   {
		   return "(deta:" + String.valueOf(data)+ ", link: " + this.link.toString() + ")"; 
	   }
   }
}
           
