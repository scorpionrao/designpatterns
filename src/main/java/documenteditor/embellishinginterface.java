package documenteditor;
import static documenteditor.formatting.Composition;

public class embellishinginterface {

    public abstract static class MonoGlyph extends Glyph {

        Composition composition;

        MonoGlyph(Composition composition) {
            this.composition = composition;
        }

    }

    public static  class Scrollbar extends MonoGlyph {

        public Scrollbar(Composition composition) {
            super(composition);

        }

        @Override
        void draw(Window window) {
            this.composition.draw(window);
            this.addScrollBar(window);
        }

        void addScrollBar(Window window) {
            window.addScrollBar();
        }

        @Override
        void setBounds(Rect rect) {

        }

        @Override
        boolean intersect(Point point) {
            return false;
        }

        @Override
        void insert(Glyph glyph, int index) {

        }

        @Override
        void remove(Glyph glyph) {

        }

        @Override
        Glyph child(int index) {
            return null;
        }

        @Override
        Glyph parent() {
            return null;
        }
    }

    public static  class Border extends MonoGlyph {

        public Border(Composition composition) {
            super(composition);
        }

        @Override
        void draw(Window window) {
            this.composition.draw(window);
            this.addBorder(window);
        }

        void addBorder(Window window) {
            window.addBorder();
        }

        @Override
        void setBounds(Rect rect) {

        }

        @Override
        boolean intersect(Point point) {
            return false;
        }

        @Override
        void insert(Glyph glyph, int index) {

        }

        @Override
        void remove(Glyph glyph) {

        }

        @Override
        Glyph child(int index) {
            return null;
        }

        @Override
        Glyph parent() {
            return null;
        }
    }
}
