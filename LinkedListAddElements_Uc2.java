package linkedlist;

public class LinkedListAddElements_Uc2 <T>{

    Node<T> head;
    Node<T> tail;


    void push( T data){
        Node<T> node = new Node<>(data);

        if (node== null){
            head = node;
            tail = node;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    void display(){
        Node<T> temp = head;

        while (temp != null){
            System.out.println(temp.data + " ");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListAddElements_Uc2<Integer> linkedList = new LinkedListAddElements_Uc2<Integer>();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);

        linkedList.display();
    }
}
