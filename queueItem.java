package ex1;

/**
 * Created by jengli on 31/01/2017.
 */
public class queueItem //object which stores the contents and the priority needed for a priority queue
{
    String contents;
    int priority;


    public queueItem(String contents, int priority) //constructs the queueItem
    {
        this.contents = contents;
        this.priority = priority;

    }

    public String toString() //allows the queueItem to be printed as a string
    {

        return '"'  + contents + '"' + ":" +priority;
    }

}
