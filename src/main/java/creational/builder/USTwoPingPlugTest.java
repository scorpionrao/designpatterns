package creational.builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class USTwoPingPlugTest {

    @Test
    public void testConcreteBuilder1() {
        final IProductBuilder builder = new ConcreteBuilder1();
        final List<IProductBuilder> builders = Arrays.asList(builder);
        final ManagingDirector1 managingDirector1 = new ManagingDirector1(builders);
        String expected = new Client(managingDirector1).buildProductAndPrint();
        String actual = "Product [wheels = 4, color = Red]";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConcreteBuilder2() {
        final IProductBuilder builder = new ConcreteBuilder2();
        final List<IProductBuilder> builders = Arrays.asList(builder);
        final ManagingDirector1 managingDirector1 = new ManagingDirector1(builders);
        String expected = new Client(managingDirector1).buildProductAndPrint();
        String actual = "Product [wheels = 8, color = Bright Red]";
        Assert.assertEquals(expected, actual);
    }
}
