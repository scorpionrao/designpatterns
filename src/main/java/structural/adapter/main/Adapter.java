package structural.adapter.main;

import java.util.Arrays;
import java.util.List;

public class Adapter implements IDomainSpecificTarget {

    AdapteeNeedsAdapting adapteeNeedsAdapting = new AdapteeNeedsAdapting();

    Adapter() {
    }

    public int getFirstNumber(Integer[] numbers) {
        List<Integer> list = Arrays.asList(numbers);
        return this.adapteeNeedsAdapting.getFirstNumber(list);
    }
}
