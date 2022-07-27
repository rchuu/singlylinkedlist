public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    private boolean IsEmpty() {
        return this.head == null; // if head is null, then the list is empty
    }

    public void AddFront(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addBack(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node runner = this.head;
        while (runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }

    public boolean Contains(int value) {
        Node runner = this.head;
        while (runner != null) {
            if (runner.value == value) {
                return true;
            }
            runner = runner.next;
        }
        return false;
    }

    public void DisplayValues() {
        if (IsEmpty()) {
            System.out.println("Empty list yo");
            return;
        }
        Node runner = this.head;
        while (runner.next != null) {
            System.out.println("$$$$$");
            String s = String.format("Node Value: %s :: Nextint Value: %s", runner.value, runner.next.value);
            System.out.println(s);
            runner = runner.next;
        }
        System.out.println("$$$$$");
        String s = String.format("Node Value: %s :: Nextint Value: %s", runner.value, runner.next.value);
        System.out.println(s);
    }

    public Integer removeBack() {
        Node runner = head;
        int valToReturn;
        if (IsEmpty())
            return null;

        if (head.next == null) {
            valToReturn = head.value;
            head = null;
            return valToReturn;
        }
        while (runner.next.next != null) {
            runner = runner.next;
        }
        valToReturn = runner.next.value;
        runner.next = null;
        return valToReturn;
    }
}
