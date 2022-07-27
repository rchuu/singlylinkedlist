public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.addBack(1);
        sll.addBack(2);
        sll.addBack(3);
        sll.addBack(1);
        int Val = sll.removeBack();
        System.out.println(Val);
    }
}
