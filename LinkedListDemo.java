package practicePRojectPhase;
import java.io.*;
import java.util.LinkedList;
public class LinkedListDemo {
	Node head;  
	static class Node 
{ 
    		int data; 
    		Node next; 
    		Node(int d) 
    		{ 
        			data = d; 
        			next = null; 
    		} 
	} 

	public static LinkedListDemo insert(LinkedListDemo list, int data) 
	{ 
    		Node new_node = new Node(data); 
    		new_node.next = null; 
		
    		if (list.head == null) 
{ 
        			list.head = new_node; 
    		} 
    		else 
{ 
        			// Else traverse till the last node and insert the new_node there 
        			Node last = list.head; 
        			while (last.next != null) 
{ 
            			last = last.next; 
        			} 
			// Insert the new_node at last node 
        			last.next = new_node; 
    		} 
    		return list; 
	} 
	public static void printList(LinkedListDemo list) 
	{	 
    		Node currNode = list.head; 
    		System.out.print("LinkedList: "); 
    		// Traverse through the LinkedList 
    		while (currNode != null) 
{ 
        			// Print the data at current node 
        			System.out.print(currNode.data + " "); 
        			// Go to next node 
        			currNode = currNode.next; 
    		} 
    		System.out.println(); 
	} 
	// Method to delete a node in the LinkedList by KEY 
	public static LinkedListDemo deleteByKey(LinkedListDemo list, int key) 
	{ 
    		// Store head node 
    		Node currNode = list.head, prev = null; 
    		if (currNode != null && currNode.data == key) 
{ 
        			list.head = currNode.next; // Changed head 
        			System.out.println(key + " found and deleted"); 
        			return list; 
    		} 
    		while (currNode != null && currNode.data != key) 
{ 
        			prev = currNode; 
        			currNode = currNode.next; 
    		} 
    		if (currNode != null) 
{ 
        			prev.next = currNode.next; 
        			System.out.println(key + " found and deleted"); 
    		} 
    		if (currNode == null) 
{ 
        			System.out.println(key + " not found"); 
    		} 
    		return list; 
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo list = new LinkedListDemo(); 
		// Insert the values 
		list = insert(list, 11); 
		list = insert(list, 24); 
		list = insert(list, 67); 
		list = insert(list, 9); 
		list = insert(list, 5); 
		list = insert(list, 78); 
		list = insert(list, 90); 
		list = insert(list, 100); 
		// Print the LinkedList 
		printList(list); 
		deleteByKey(list, 11); 
		printList(list); 
		deleteByKey(list, 78); 
		printList(list); 		
		deleteByKey(list, 5); 
		printList(list); 

} 

	}


