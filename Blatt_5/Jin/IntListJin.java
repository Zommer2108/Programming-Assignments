public class IntListJin {
    private ListNode first;
    private ListNode last;
    private int size = 0;

    private class ListNode {
        int value;
        ListNode prev;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public void addFirst(int x) {
        ListNode newNode = new ListNode(x);
        if (isEmpty()) {
            last = newNode;
        } else {
            first.prev = newNode;
            newNode.next = first;
        }
        first = newNode;
        size++;
    }

    public void addLast(int x) {
        ListNode newNode = new ListNode(x);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }

    public void remove(int x) {
        ListNode current = first;
        int s = size;
        for (int i=1; i<=s; i++) {

            if (current != null && current.value == x) {
                if (current == first) {
                    first = current.next;
                    size--;
                } else {
                    current.prev.next = current.next;
                    size--;
                }
                if (current == last && current.value == x) {
                    last = current.prev;
                    size--;
                } else {
                    current.next.prev = current.prev;
                    size--;
                }
            }
            current = current.next;
        }
    }

    public boolean contains(int x) {
        ListNode current = first;
        while (current != null && current.value != x) {
            current = current.next;
        }
        return current != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        ListNode current = first;
        while (current != null) {
            sb.append(current.value);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }

    public Iterator iterator() {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<Integer> {
        private ListNode current = first;

        public boolean hasNext() {
            return current != null;
        }

        public Integer next() {
            int value = current.value;
            current = current.next;
            return value;
        }
    }

}
