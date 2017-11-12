package documenteditor;

public class lookandfeel {

    public abstract static class GUIFactory {

        public abstract ScrollBar createScrollBar();
        public abstract Button createButton();
        public abstract Menu createMenu();
    }

    public static class MacFactory {

        public ScrollBar createScrollBar() {
            return new MacScrollBar();
        }
        public Button createButton() {
            return new MacButton();
        }
        public Menu createMenu() {
            return new MacMenu();
        }
    }

    public abstract static class ScrollBar extends Glyph {

    }

    public static class MacScrollBar extends ScrollBar {

        @Override
        void draw(Window window) {

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

    public abstract static class Button extends Glyph {

    }

    public static class MacButton extends Button {

        @Override
        void draw(Window window) {

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

    public abstract static class Menu extends Glyph {

    }

    public static class MacMenu extends Menu {

        @Override
        void draw(Window window) {

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
