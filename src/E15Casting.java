import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class E15Casting {

    public static void main(String[] args) {
        Precipitation var = new Rain(2);
        Snow s1 = (Snow) new Precipitation(4);
        // Snow s2 = (Snow) new Rain(4);
        // Snow s3 = new Precipitation(0.5);
        Precipitation r1 = new Rain(1);
        Rain r2 = (Rain) r1;

        Set<Integer> set1 = new HashSet<>();
        // int i1 = set1.first();
        Set<Integer> set2 = new TreeSet<>();
        // int i2 = set2.first();
        SortedSet<Integer> set3 = new TreeSet<>();
        int i3 = set3.first();
    }

    static class Precipitation {
        Precipitation(double d) {
            inches = d;
        }

        private double inches;
    }

    static class Rain extends Precipitation {
        Rain(double d) {
            super(d);
        }
    }

    static class Snow extends Precipitation {
        Snow(double d) {
            super(d);
        }
    }
}
