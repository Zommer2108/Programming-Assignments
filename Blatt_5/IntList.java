import java.util.List;

class IntList {

    public class Iterator {
        private ListCell cursor;

        /*
        public ListCell iterator() {
            return new Iterator(head);
        }


         */
        private Iterator(ListCell start) {
            cursor = start;
        }

        public boolean hasNext() {
            return (cursor != null);
        }

        public int next() {
            int currentContent = cursor.content;
            cursor = cursor.next;
            return currentContent;
        }


    }

    private class ListCell {
        int content;
        ListCell next;

        ListCell(int x, ListCell n) {
            this.content = x;
            this.next = n;
        }
    }

    public ListCell head;

    public IntList() {
        head = null;
    }

    public void addFirst(int x) {
        ListCell newHead = new ListCell(x, head);
        head = newHead;
    }

    public void addLast(int x) {

        if (head == null) {
            head = new ListCell(x, null);
        } else {

            ListCell tempHead = head;
            while (tempHead.next != null) {
                tempHead = tempHead.next;
            }

            tempHead.next = new ListCell(x, null);
        }
    }

    public void remove(int x) {
        ListCell searcher = head;

        while (searcher != null && searcher.content == x) {
            head = searcher = searcher.next;
        }

        if (searcher == null) {
            return;
        }

        while (searcher.next != null) {
            if (searcher.next.content == x) {
                searcher.next = searcher.next.next;
            } else {
                searcher = searcher.next;
            }
        }
    }

    public boolean contains(int x) {

        for (ListCell checkHead = head; checkHead != null; checkHead = checkHead.next) {
            if (checkHead.content == x) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int length = 0;

        for (ListCell iterator = head; iterator != null; iterator = iterator.next) {
            length++;
        }

        return length;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }


    public void reverse() {
        ListCell safeHead = head;
        ListCell stuff = head;
        int tempContent = 0;
        int length = 0;

        while (stuff.next != null) {
            stuff = stuff.next;
            length++;
        }
        head = safeHead;
        stuff = head;
        int counter = 0;

        while (counter < length) {
            if (stuff.next != null) {
                stuff = stuff.next;
            } else {
                tempContent = stuff.content;
                remove(stuff.content);
            }
            addFirst(tempContent);
            stuff = safeHead;
            counter++;
        }
    }

    @Override
    public String toString() {
        String expression = "[";
        String delimeter = ", ";
        final String CLOSING_STATEMENT = "]";

        for (ListCell c = head; c != null; c = c.next) {
            if (c.next == null) {
                expression += String.valueOf(c.content);

            } else {
                expression += String.valueOf(c.content);
                expression += delimeter;

            }
        }
        expression += CLOSING_STATEMENT;
        return expression;
    }
}
