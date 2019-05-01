package ex1;

import java.util.ArrayList;

/**
 * Created by jengli on 31/01/2017.
 */
public class prioQueue {
    int frontPos,backPos;

    pQueueException empty = new pQueueException("The queue is empty"); //defines the excepetion errors
    pQueueException outOfRange = new pQueueException("The priority is outside the range 1 - 20");
    ArrayList<queueItem> currentQueue; //creates the ArrayList of queueItems

    public prioQueue(){} //contrsucts an empty prioQueue
    {
        this.currentQueue = new ArrayList<>();
        this.frontPos = 0;
        this.backPos = -1;
    }

    private boolean isEmpty() //checks if the prioQueue is empty
    {
        if (frontPos == backPos+1) return true;

        return false;
    }

    public String front() //outputs the value of the first item in the queue
    {
        queueItem temp;
        if (!isEmpty())
        {
            temp = currentQueue.get(frontPos-1);
            return temp.contents;
        }
        throw empty;

    }


    public void deleteFront() //removes the first item in the queue
    {
        if (!isEmpty())
        {
            frontPos --;
        }
        else
        {
            throw empty;
        }


    }

    public int frontPri() //outputs the values of the priority of the first item in the queue
    {
        if (!isEmpty())
        {
            return (currentQueue.get(frontPos-1).priority);
        }
        throw empty;
    }


    public void addToPQ(String data, int priority) //adds to the prioQueue
    {
        int count = 0;
        queueItem temp = new queueItem(data,priority);

        if (temp.priority > 20 || temp.priority < 1 ) throw outOfRange; //throws exception when priority is invalid

        if (currentQueue.size() == 0) //when adding to a empty queue
        {
            currentQueue.add(count, temp);
            frontPos ++;
        }

        else  //when adding to a non-empty queue
        {
            for (queueItem obj : currentQueue) {
                if (obj.priority < temp.priority && count <= frontPos-1) {
                    count++;
                }
            }
            currentQueue.add(count, temp);
            frontPos ++;
        }
    }

    @Override
    public String toString() //allows the queue object to be output as a string
    {
        String output = "";
        if  (!isEmpty()) {
            for (int x = 0; x <= frontPos-1; x++) {
                output = output + currentQueue.get(x).toString();
                if (x != frontPos-1) output = output + ",";
            }
            output = "<" + output + ">";
        }
        return output;
    }


}


class pQueueException extends RuntimeException //defines the exception
{
    public pQueueException(String s) { super(s);}
}
