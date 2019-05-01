package ex1;

public class Main {

    public static void main(String[] args) {
        prioQueue test = new prioQueue();
        System.out.println("Queue contents: " + test.toString());
        System.out.println("Adding 'hi' with priority 1");
        test.addToPQ("hi",1);
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Adding 'tom' with priority 8");
        test.addToPQ("tom",8);
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Adding 'hi' with priority 1");
        test.addToPQ("hi",1);
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Adding 'cool' with priority 1");
        test.addToPQ("cool",1);
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Calling front, output should be 'tom': " + test.front());

        System.out.println("Calling frontPri, output should be '8': " + test.frontPri());

        System.out.println("Calling deleteFront, output should remove 'tom':8 : " );
        test.deleteFront();
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Calling deleteFront, output should remove 'hi':1 : " );
        test.deleteFront();
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Calling deleteFront, output should remove 'hi':1 : " );
        test.deleteFront();
        System.out.println("Queue contents: " + test.toString());

        System.out.println("Calling deleteFront, output should remove 'cool':1 : " );
        test.deleteFront();
        System.out.println("Queue contents: " + test.toString() +"\n");



        System.out.println("Testing exceptions");

        System.out.println("Calling front on an empty priority queue");
        try
        {
            test.front();
        }
        catch (pQueueException e)
        {
            System.out.println(e);
        }

        System.out.println("Calling frontPri on an empty priority queue");
        try
        {
            test.frontPri();
        }
        catch (pQueueException e)
        {
            System.out.println(e);
        }

        System.out.println("Calling deleteFront on an empty priority queue");
        try
        {
            test.deleteFront();
        }
        catch (pQueueException e)
        {
            System.out.println(e);
        }

        System.out.println("Adding an item with priority outside of range 1 - 20");
        try
        {
            test.addToPQ("hi",21);
        }
        catch (pQueueException e)
        {
            System.out.println(e);
        }




    }
}
