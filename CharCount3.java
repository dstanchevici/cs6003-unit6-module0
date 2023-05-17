class ListItem {
    char data;
    ListItem next;
}

class MyLinkedList {

    ListItem front, rear;
    int numItems = 0;

    public void add (char c)
    {
        if (front == null) {
            front = rear = new ListItem();
            front.data = c;
        }
        else {
            ListItem newItem = new ListItem();
            newItem.data = c;
            rear.next = newItem;
            rear = newItem;
        }

        numItems ++;
    }

    public int size ()
    {
        return numItems;
    }

    public char get (int i)
    {
        if (front == null) {
            System.out.println("ERROR in MyLinkedList.contains(): list is empty");
            return '@';
        }

        if (i >= numItems || i < 0) {
            System.out.println("ERROR in MyLinkedList.get(): index " + i + " is invalid for a list of size " + numItems);
            return '@';
        }

        ListItem ptr = front;
        for (int j=0; j<i; j++) {
            ptr = ptr.next;
        }
        return ptr.data;
    }

    public boolean contains (char c)
    {
        if (front == null) {
            return false;
        }

        ListItem ptr = front;
        while (ptr != null) {
            if (ptr.data == c) {
                return true;
            }
            ptr = ptr.next;
        }
        return false;
    }
}

public class CharCount3 {

    public static void main(String[] argv)
    {
        char[] A = {'t', 'h', 'e', 'd', 'o', 'g', 'a', 't', 'e'};
        char[] B = {'m', 'y', 'h', 'o', 'm', 'e', 'w', 'o', 'r', 'k'};
        System.out.println( countFirstInSecond(A,B) );
    }

    static int countFirstInSecond (char[] A, char[] B)
    {
        MyLinkedList onlyInA = new MyLinkedList ();
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if ( (A[i] == B[j]) && ( !onlyInA.contains(A[i]) ) ) {
                    onlyInA.add(A[i]);
                    break;
                }
            }
        }
        /*
        for (int i=0; i<onlyInA.size(); i++) {
            System.out.println(onlyInA.get(i));
        }
        */
        return onlyInA.size();
    }
}
