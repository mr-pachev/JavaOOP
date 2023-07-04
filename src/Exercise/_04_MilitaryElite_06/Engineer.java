package src.Exercise._04_MilitaryElite_06;

import java.util.Collection;

public interface Engineer extends SpecialisedSoldier {

    Collection<RepairImpl> getRepairs();

    void addRepair(RepairImpl repair);
}
