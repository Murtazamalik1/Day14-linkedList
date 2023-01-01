package linkedlist;

public class PopElements_Uc9 <T>{
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

    public Node<T> search(T searchData){
        Node<T> temp = head;
        while (temp != null){
            if (temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public boolean insertAfter(T searchData, T insertData){

        Node<T> newNode = new Node<>(insertData);
        Node<T> searchNode = search(searchData);

        if (searchNode != null){
            newNode.next = searchNode.next;
            searchNode.next = newNode;
            return true;
        }
        return false;

    }

    public void popElements(T value){

        Node<T> searchedNode = search(value);
        Node<T> temp = head;

        while (temp.next != searchedNode) {

            temp = temp.next;
        }
        temp.next = searchedNode.next;
    }

    public int size(){
        int count = 0;
        Node<T> temp = head;

        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    void display(){
        Node<T> temp = head;
        while (temp != null){
            System.out.println(temp.data + "");

            temp = temp.next;

        }
    }

    public static void main(String[] args) {

        PopElements_Uc9<Integer> linkedList = new PopElements_Uc9<>();

        linkedList.push(70);
        linkedList.push(56);

        linkedList.insert(30);

        linkedList.display();
        System.out.println();

        if (linkedList.search(30) != null){
            System.out.println("Data Found");
        }
        else {
            System.out.println("Data Not Found");
        }

        System.out.println(linkedList.insertAfter(30,40));
        System.out.println();
        linkedList.display();
        System.out.println();

        linkedList.popElements(40);
        linkedList.display();
        System.out.println();

        System.out.println(linkedList.size());


    }
}
