package linkedlist;

public class SearchingElements_Uc7 <T>{

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
        void display(){
            Node<T> temp = head;
            while (temp != null){
                System.out.println(temp.data + "");

                temp = temp.next;

        }
    }

    public static void main(String[] args) {
        SearchingElements_Uc7<Integer> linkedList = new SearchingElements_Uc7<>();

        linkedList.push(70);
        linkedList.push(56);
        linkedList.insert(30);

        System.out.println(linkedList.popLast());

        linkedList.display();
        System.out.println();

        if (linkedList.search(30) != null){
            System.out.println("Data Found");
        }
        else {
            System.out.println("Data Not Found");
        }
    }
}
