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
public class Queue_Perform 
{
 int arr[]=new int[5];
 int front;
 int rear;
 int size;
 public Queue_Perform()
 {
     rear=front=-1;
 }
 public void enqueue(int val)
 {
     if((rear+1)%arr.length==front)
     {
         System.out.println("OverFlow");
     }
     else if(front==-1)
     {
         rear++;
         arr[rear]=val;
         
         front++;
         size++;
     }
     else
     {
         rear=(rear+1)%arr.length;
         arr[rear]=val;
         size++;
     }
     
 }
 public void dequeue()
 {
      if(front==-1)
      {
          System.out.println("Queue UnderFlow: ");
      }
      else
      {
          int temp;
          temp=arr[front];
          size--;
          front++;
      }
      if(front==arr.length)
      {
          System.out.println("Queue is Empty");
      }
 }
 public void Display()
 {
    if(rear>=front)
    {
      while(rear>=front)
      {
          System.out.println(arr[front]);
          front++;
      }
 }
    else
    {
       for(int i=front;i<arr.length;i++)
       {
       System.out.println(arr[i]);
       }
       for(int i=0;i<=rear;i++)
       {
         System.out.println(arr[i]);  
       }
 }
 }
 public int getSize()
 {
     return(size);
 }
}


  