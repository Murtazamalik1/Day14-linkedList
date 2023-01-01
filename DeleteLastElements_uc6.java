package linkedlist;

public class DeleteLastElements_uc6 <T>{
    Node<T> head;
    Node<T> tail;

    void push(T data){
        Node<T> node = new Node<>(data);
        if (head == null){
            head = node;
            tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
    }

    void add(T data){
        Node<T> node = new Node<>(data);
        if (head == null){
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
    }

    public T popLast(){
        T deleteLastElements = tail.data;
        Node<T> temp = head;

        while (temp.next != tail){
            temp = temp.next;

        }

        temp.next = null;
        temp = tail;
        return deleteLastElements;

    }
    void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data + "");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DeleteLastElements_uc6<Integer> linkedList = new DeleteLastElements_uc6<>();

        linkedList.push(70);
        linkedList.push(56);
        linkedList.push(30);

        linkedList.popLast();

        linkedList.display();
    }

}
