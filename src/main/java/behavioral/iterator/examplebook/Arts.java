package behavioral.iterator.examplebook;


public class Arts implements ISubject {

    private String[] subjects;

    Arts() {
        subjects = new String[2];
        subjects[0] = "Physics";
        subjects[1] = "Chemistry";
    }
    @Override
    public IIterator createIterator() {
        return new ArtsIterator(subjects);
    }

    public class ArtsIterator implements IIterator {

        private String[] subjects;
        int position;

        private ArtsIterator(String[] subjects) {
            this.subjects = subjects;
            this.position = 0;
        }

        @Override
        public boolean isDone() {
            return position >= subjects.length;
        }

        @Override
        public String next() {
            return subjects[position++];
        }
    }
}
