package creational.prototype.cloning;

import org.junit.Assert;

public class ColoredCircle implements Cloneable {
    private int x;
    private int y;
    private Color color;

    public ColoredCircle(int x, int y, Color color) throws CloneNotSupportedException {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public ColoredCircle clone() throws CloneNotSupportedException {
        return (ColoredCircle) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Color color = new Color("RED");
        ColoredCircle cc1 = new ColoredCircle(200, 200, color);
        ColoredCircle cc2 = cc1.clone();
        Assert.assertTrue(cc1 != cc2);
        Assert.assertTrue(cc1.clone().getClass() == cc2.getClass());
        Assert.assertTrue(cc1.clone().equals(cc2));
    }
}
