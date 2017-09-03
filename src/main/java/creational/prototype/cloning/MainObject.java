package creational.prototype.cloning;

import org.junit.Assert;

public class MainObject implements Cloneable {

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        MainObject x = new MainObject();
        MainObject c = (MainObject) x.clone();
        Assert.assertTrue(c != x);
        Assert.assertTrue(x.clone().getClass() == x.getClass());
        Assert.assertTrue(x.clone().equals(x));
    }
}
