package ge.edu.btu.queue;

public class Runner {

    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>();
        integerQueue.addFirst(5);
        integerQueue.addFirst(9);
        integerQueue.addLast(14);
        integerQueue.addFirst(12);

        // 12 9 5 14
        try {
            int first = integerQueue.getFirst();
            System.out.println(first);
        } catch (QueueException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა, " + ex.getMessage());
        }

        try {
            int last = integerQueue.deleteLast();
            System.out.println(last);
            last = integerQueue.getLast();
            System.out.println(last);
        } catch (QueueException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა, " + ex.getMessage());
        }


        Queue<String> stringQueue = new Queue<>();
        stringQueue.addFirst("Giorgi");
        stringQueue.addFirst("Daviti");
        stringQueue.addLast("Nika");
        stringQueue.addLast("Saba");
        try {
            System.out.println(stringQueue.getFirst());
        } catch (QueueException ex) {
            System.out.println("დაფიქსირდა გაუთვალისწინებელი შეცდომა, " + ex.getMessage());
        }
    }
}
