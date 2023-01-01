package linkedlist;

public class DeleteFirstElement_Uc5 <T>{
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

    public T Pop(){
        T deleteElement =  head.data;
        head = head.next;
        return deleteElement;

    }
    void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data + "");

            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DeleteFirstElement_Uc5<Integer> linkedList = new DeleteFirstElement_Uc5<>();
        linkedList.push(70);
        linkedList.push(56);
        linkedList.push(30);

        linkedList.Pop();

        linkedList.display();
    }

}
