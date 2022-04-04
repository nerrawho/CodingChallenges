import java.util.*;

public class CircularArray<T> implements Iterable<T>{

    private ArrayList<T> dataStructure;

    //No-args constructor to declare an arraylist.
    public CircularArray() {
        dataStructure = new ArrayList<>();
    }

    //Single param constructor to declare an arraylist with specific size.
    public CircularArray(int capacity) {
        dataStructure = new ArrayList<>(capacity);
    }

    /*
    Get method to return data at specified index.
    If index given is greater than the max index,
    We use modulos on the given index to implement the circular
    behavior.
     */
    public T get(int index) {
        int maxSize = dataStructure.size();

        if(index < maxSize)
            return dataStructure.get(index);
        else
            return dataStructure.get(index % maxSize);
    }

    //Appends to the end of arraylist
    public void add(T data) {
        dataStructure.add(data);
    }

    //Returns size of the arraylist
    public int size() {
        return dataStructure.size();
    }

    //Iterators used to support enhanced for loop
    public Iterator<T> getData() {
        return dataStructure.iterator();
    }

    public Iterator<T> iterator() {
        return this.getData();
    }

}
