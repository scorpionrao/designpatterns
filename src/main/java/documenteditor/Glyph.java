package documenteditor;

public abstract class Glyph {

    /* appearance */
    abstract void draw(Window window);
    abstract void setBounds(Rect rect);

    /* hit */
    abstract boolean intersect(Point point);

    /* structure */
    abstract void insert(Glyph glyph, int index);
    abstract void remove(Glyph glyph);
    abstract Glyph child(int index);
    abstract Glyph parent();
}
