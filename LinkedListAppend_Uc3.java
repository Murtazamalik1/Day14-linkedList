package linkedlist;

public class LinkedListAppend_Uc3 <T>{
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
    void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data + "");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAppend_Uc3<Integer> linkedList = new LinkedListAppend_Uc3<>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.display();
        System.out.println();

        LinkedListAppend_Uc3<Integer> linkedList1 = new LinkedListAppend_Uc3<>();
        linkedList1.add(56);
        linkedList1.add(30);
        linkedList1.add(70);

        linkedList1.display();
    }
}
