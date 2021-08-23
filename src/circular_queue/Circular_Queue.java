/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular_queue;

/**
 *
 * @author Hasnain Gakhar
 */
public class Circular_Queue {

    public static void main(String[] args) {
    Queue_Perform abc=new Queue_Perform();
  
abc.enqueue(5);
abc.enqueue(6);
abc.enqueue(7);
abc.enqueue(8);
abc.enqueue(9);

abc.dequeue();
abc.enqueue(5);
abc.Display();
System.out.println("Size of =Circular Queue is:"+abc.getSize());
}
 
    
}
