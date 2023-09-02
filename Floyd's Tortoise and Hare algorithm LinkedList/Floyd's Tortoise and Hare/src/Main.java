public class Main {

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        Node middleNode = myList.findMiddleNode();
        System.out.println(middleNode.value); //
    }
}