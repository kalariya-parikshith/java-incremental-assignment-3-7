class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }

    public String toString(){
        if(data == null){
            return "null";
        }
        else {
            return data.toString();
        }
    }
}

class SList<T>{
    Node<T> head = new Node<T>(null);

    public String toString(){
        if(head.next == null){
            return "List is empty.";
        }

        SListIterator<T> it = iterator();
        String listInStringFormat = "";
        while(it.hasNext()){
            listInStringFormat = listInStringFormat + it.next() + " --> ";
        }
        return listInStringFormat+" END";
    }

    SListIterator<T> iterator(){
        return new SListIterator<T>(head);
    }
}

class SListIterator<T>{
    Node<T> current;
    Node<T> head;
    public SListIterator(Node<T> head) {
        this.current = head;
        this.head = head;
    }

    public boolean hasNext(){
        if(current.next == null){
            return false;
        }
        else {
            return true;
        }
    }

    public Node<T> next(){
        current = current.next;
        return current;
    }
    public void insert(T data) {
        current.next = new Node<T>(data);
        current = current.next;
    }
    public void remove(){
        Node<T> temp = head;
        if(temp.next == null){
            System.out.println("List is empty");
            return ;
        }
        while(temp.next.next != null){
            temp = temp.next;
        }
        current = temp;
        System.out.println("Removing: " + temp.next.data);
        temp.next = null;
    }

}

public class SinglyLinkedList {

    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        SListIterator<Integer> it = list.iterator();

        System.out.println(list);
        it.insert(10);

        System.out.println(list);
        it.insert(20);

        System.out.println(list);
        it.insert(30);

        System.out.println(list);
        it.remove();

        System.out.println(list);
        it.remove();

        System.out.println(list);
        it.remove();
        
        System.out.println(list);

    }
}