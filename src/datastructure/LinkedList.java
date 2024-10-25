package datastructure;

public class LinkedList <T> {
    LinkedList<T> next;
    T value;

    public LinkedList() {
    }

    public LinkedList(T value) {
        this.value = value;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public LinkedList<T> setNext(LinkedList<T> next) {
        this.next = next;
        return this;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        LinkedList<T> current = this;
        while(current!=null){
            str.append(current.getValue());
            str.append("->");
            current=current.getNext();
        }
        return str.toString()+"null";
    }
}
