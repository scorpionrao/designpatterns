package behavioral.iterator.examplebook;


import java.util.LinkedList;

public class Science implements ISubject {

    private LinkedList<String> subjects;
    
    Science() {
        subjects = new LinkedList<>();
        subjects.addLast("Physics");
        subjects.addLast("Chemistry");
        subjects.addLast("Physics");
    }
    @Override
    public IIterator createIterator() {
        return new ScienceIterator(subjects);
    }

    public class ScienceIterator implements IIterator {

        private LinkedList<String> subjects;
        int position;

        private ScienceIterator(LinkedList<String> subjects) {
            this.subjects = subjects;
            this.position = 0;
        }

        @Override
        public boolean isDone() {
            return position >= subjects.size();
        }

        @Override
        public String next() {
            return subjects.get(position++);
        }
    }
}
