//Create thread1 by extending Thread
class thread1 extends Thread
{
    public void run() {

        for (int i=0;i<5;i++){
            //get name of current thread using getName() method
            System.out.println("Here "+this.getName()+" is: "+i);
        }
    }
   
       public static void main(String[] args)       {
        //create object of 1st thread
        thread1 t1=new thread1();
        t1.setName("First Thread");
        t1.start();//start t1 thread
        t1.yield();

        //create object of second thread
        thread2  t2=new thread2();
        Thread th=new Thread(t2);
        th.start();
           
      //Join method
      //thread2 implements before the thread1
          try
        {
        	th.join();
        }
        catch(InterruptedException ie)
        {
          	ie.printStackTrace();
        }	
    }
}



//Creating thread by  implementing Runnable interface
class thread2 implements Runnable{
   
    public void run() {
   System.out.println("Hello.......Here is thread 2....");         

    }
 }



/*
Output:
Hello.......Here is thread 2....
Here First Thread is: 0
Here First Thread is: 1
Here First Thread is: 2
Here First Thread is: 3
Here First Thread is: 4

*/ 

