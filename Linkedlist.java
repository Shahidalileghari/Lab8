package linkedlist;

public class Linkedlist {
    
	  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
}  
  
     
    Node head, tail = null;  
  
     
    public void addNode(int data) {  
         
        Node newNode = new Node(data);  
  
         
        if(head == null) {  
            
            head = tail = newNode;  
              
            head.previous = null;  
             
            tail.next = null;  
        }  
        else {  
             
            tail.next = newNode;  
           
            newNode.previous = tail;  
           
            tail = newNode;  
             
            tail.next = null;  
        }  
    }  
  
     
    public  void deleteFromStart() {  
         
        if(head == null) {  
            return ;  
        }  
        else {  
              
            head=head.next;
            head.previous=null;
        }
		return ;  
    } 
    
    
    public void deleteAtlast()
    {
    	System.out.println("The deleted elements are:");
    	if(head==null)
    	{
    		return ;
    	}
    	
    	else {
    		head.next=null;
			
			
					
		}
    
    }
       public void insertAtLast(int data)
       {
    	   System.out.println("Inserting element at last");
    	   
    	   Node node=new Node(data);
    	   
    	   if(head==null)
    	   {
    		   head=new Node(data);
    	return ;
    	   }
    	   
    	   node.next=null;
    	   
    	   Node last=head;
    	   
    	   while(last.next!=null)
    	   {
    		   last=last.next;
    	   }
    	  
    	   last.next=node;
    	   
    	   
    	   return;
    	   
       }
       
        
  
     
    public void display() {  
  for(Node p = head ; p!=null; p = p.next) {
	  System.out.println(p.data);
  }
}
}
