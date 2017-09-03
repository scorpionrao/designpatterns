package structural.adapter.main;

import java.util.List;

public class AdapteeNeedsAdapting {
    public int getFirstNumber(List<Integer> numbers) {
        return numbers.get(0);
    }
}
