import java.util.Iterator;

public class MyLinkedList <E> implements Iterable<E>{
    private int size = 0;
    private Node <E> first;
    private Node <E> last;

    private static class Node <E>{
        private E el;
        private Node <E> next;

        public Node(E el) {
            this.el = el;
        }
    }
    public class MyListIterator <E> implements Iterator<E> {
        private Node <E> current;

        public MyListIterator(Node<E> current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E buff = this.current.el;
            this.current = this.current.next;
            return buff;
        }
    }

        //add element in end of list
    public void addEl (E el) {
        Node<E> buff = new Node<>(el);
        if (this.size == 0) {this.first = buff;}
        else {this.last.next = buff;}
        this.size++;
        this.last = buff;
    }

    public void addInStart(E el) {
        Node<E> buff = new Node<>(el);
        if (this.size == 0) {this.last = buff;}
        else{buff.next = this.first;}
        this.size++;
        this.first = buff;
    }

        // return size  current instance 'mylinkedlist'
    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyListIterator<E>(this.first);
    }
    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for (E i: this) {
            tmp.append(i + ", ");
        }
        tmp.replace(tmp.lastIndexOf(", "), tmp.length(), "");
        return "{"+tmp+"}";
    }
}
