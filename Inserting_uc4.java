package linkedlist;

public class Inserting_uc4 <T>{

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

    void insert(T data){
        Node<T> node = new Node<>(data);
            head.next = node;
            node.next = tail;

    }
    void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data + "");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Inserting_uc4<Integer> linkedList1 = new Inserting_uc4<Integer>();

        linkedList1.add(70);

        linkedList1.add(30);

        linkedList1.add(56);

        linkedList1.display();

        Inserting_uc4<Integer> linkedList = new Inserting_uc4<>();
        linkedList.push(70);

        linkedList.push(30);

        linkedList.insert(56);

        linkedList.display();
    }

}
