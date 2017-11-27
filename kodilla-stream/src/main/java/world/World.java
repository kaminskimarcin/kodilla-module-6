package world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class World {
    private final Set<Continent> continentsList = new HashSet<>();

    public BigDecimal getPeopleQuantity() {
        BigDecimal result = continentsList.stream()
                .flatMap(Continent -> Continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return result;
    }
}
