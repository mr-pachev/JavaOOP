package src.Exercise._04_MilitaryElite_06;

import java.util.Collection;

public interface Commando extends SpecialisedSoldier {

    Collection<MissionImpl> getMission();

    void addMission(MissionImpl mission);
}
