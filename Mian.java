  
package linkedlist;



public class Mian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Linkedlist linkedlist=new Linkedlist();
    
    linkedlist.addNode(12);
    linkedlist.addNode(23);
    linkedlist.addNode(45);
    linkedlist.display();
    System.out.println();
    linkedlist.deleteFromStart();
    
    linkedlist.display();
    System.out.println("Deleting ");
    linkedlist.deleteAtlast();
    
    System.out.println("Remaining list");
    linkedlist.display();
    
    linkedlist.insertAtLast(34);
    
    linkedlist.display();
    //linkedlist.addNode(321);
    linkedlist.insertAtLast(394);
    
    linkedlist.display();
    
    
	}

}
