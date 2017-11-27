package world;

import java.math.BigDecimal;
import java.util.Set;

public final class World {

    public BigDecimal getPeopleQuantity(Set<Continent> continentsSet) {
        BigDecimal result = continentsSet.stream()
                .flatMap(Continent -> Continent.getCountrySet().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return result;
    }
}
