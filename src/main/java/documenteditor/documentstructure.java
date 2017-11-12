package documenteditor;

import java.util.ArrayList;
import java.util.List;

public class documentstructure {

    public static class Rectangle extends Glyph {

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

    public static class Polygon extends Glyph {

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

    public static class Character extends Glyph {

        char c;

        Character(char c) {
            this.c = c;
        }

        @Override
        void draw(Window window) {
            window.drawCharacter(c);
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

    public static class Row extends Glyph {

        List<Glyph> children = new ArrayList<>();



        @Override
        void draw(Window window) {
            for(Glyph glyph : children) {
                glyph.draw(window);
            }
        }

        @Override
        void setBounds(Rect rect) {

        }

        @Override
        boolean intersect(Point point) {
            for(Glyph glyph : children) {
                if(glyph.intersect(point)) {
                    return true;
                }
            }
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

    public static class Column extends Glyph {

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

    public static class Page extends Glyph {

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
