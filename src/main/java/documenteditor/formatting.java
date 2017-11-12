package documenteditor;

import java.util.LinkedList;
import java.util.List;

public class formatting {

    public static class Composition extends Glyph {

        Compositor compositor;
        List<Glyph> children = new LinkedList<>();

        void Composition(Compositor compositor) {
            this.compositor = compositor;
        }

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
            /* */
            compositor.compose();

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

    public abstract static class Compositor {

        Composition composition;

        void setComposition(Composition composition) {
            this.composition = composition;
        }

        abstract void compose();
    }

    public static class ArrayCompositor extends Compositor {

        @Override
        void compose() {
            /* Non visible glyphs created by compositor */
            new documentstructure.Page();
            new documentstructure.Column();
            new documentstructure.Row();
            for(Glyph glyph : composition.children) {
                for(int i = 0; i < 5; i++) {
                    // format glyph quickly without color
                }
                new documentstructure.Row();
            }
        }
    }
}
