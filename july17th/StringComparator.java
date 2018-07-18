package july17th;

import java.util.Comparator;

public class StringComparator implements Comparator <String> {
    @Override
    public int compare(String o1, String o2) {
        // by default return 0;
        return o2.compareTo(o1);
    }
}
