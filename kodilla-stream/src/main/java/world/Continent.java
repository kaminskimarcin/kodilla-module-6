package world;

import java.util.Set;

public final class Continent {
    private final String name;
    private final Set<Country> countryList;

    public Continent(String name, Set<Country> countryList) {
        this.name = name;
        this.countryList = countryList;
    }

    public String getName() {
        return name;
    }

    public Set<Country> getCountrySet() {
        return countryList;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "name='" + name + '\'' +
                ", countryList=" + countryList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (name != null ? !name.equals(continent.name) : continent.name != null) return false;
        return countryList != null ? countryList.equals(continent.countryList) : continent.countryList == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (countryList != null ? countryList.hashCode() : 0);
        return result;
    }
}
