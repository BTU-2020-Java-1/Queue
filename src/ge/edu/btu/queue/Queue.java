package ge.edu.btu.queue;

public class Queue<T> implements IQueue<T> {

    private Element<T> first;

    private Element<T> last;

    @Override
    public void addFirst(T value) {
        Element<T> newFirst = new Element<>(value);
        if (first != null) {
            first.setLeft(newFirst);
            newFirst.setRight(first);
        } else {
            last = newFirst;
        }
        first = newFirst;
    }

    @Override
    public void addLast(T value) {
        Element<T> newLast = new Element<>(value);
        if (last != null) {
            last.setRight(newLast);
            newLast.setLeft(last);
        } else {
            first = newLast;
        }
        last = newLast;
    }

    @Override
    public T getFirst() throws QueueException {
        if (first == null) {
            throw new QueueException("Queue is empty");
        }
        return first.getValue();
    }

    @Override
    public T getLast() throws QueueException {
        if (last == null) {
            throw new QueueException("Queue is empty");
        }
        return last.getValue();
    }

    @Override
    public T deleteFirst() throws QueueException {
        if (first == null) {
            throw new QueueException("Queue is empty");
        }
        T value = first.getValue();

        if (first.getRight() != null) {
            first.getRight().setLeft(null);
        }
        first = first.getRight();

        return value;
    }

    @Override
    public T deleteLast() throws QueueException {
        if (last == null) {
            throw new QueueException("Queue is empty");
        }
        T value = last.getValue();

        if (last.getLeft() != null) {
            last.getLeft().setRight(null);
        }
        last = last.getLeft();

        return value;
    }
}
