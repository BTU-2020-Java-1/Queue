package ge.edu.btu.queue;

public interface IQueue<T> {

    void addFirst(T value);

    void addLast(T value);

    T getFirst() throws QueueException;

    T getLast() throws QueueException;

    T deleteFirst() throws QueueException;

    T deleteLast() throws QueueException;
}
