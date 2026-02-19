package enums;

import model.Ninja;

import java.util.Comparator;

public enum SortOption {

    AGE(Comparator.comparing(Ninja::getAge)),
    NAME(Comparator.comparing(Ninja::getName)),
    VILLAGE(Comparator.comparing(Ninja::getVillage));

    private final Comparator<Ninja> comparator;

    private SortOption(Comparator<Ninja> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Ninja> getComparator() {
        return comparator;
    }
}
