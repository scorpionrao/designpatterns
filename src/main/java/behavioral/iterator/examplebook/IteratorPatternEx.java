package behavioral.iterator.examplebook;

/*
Data Structure  - represent business object (POJOs) or aggregate (Primitives/POJOs).
Collection      - require access and traverse.
Class           - encapsulate business object and/or aggregate.
 */
public class IteratorPatternEx {
    public static void main(String[] args) {
        ISubject science_subject = new Science();
        ISubject arts_subject = new Arts();

        IIterator science_iterator = science_subject.createIterator();
        IIterator arts_iterator = arts_subject.createIterator();

        System.out.println("Science Subjects");
        print(science_iterator);

        System.out.println("Arts Subjects");
        print(arts_iterator);
    }

    private static void print(IIterator iterator) {
        while(!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
