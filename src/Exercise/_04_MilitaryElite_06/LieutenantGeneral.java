package src.Exercise._04_MilitaryElite_06;

import java.util.Collection;

public interface LieutenantGeneral extends Private {

    Collection<Soldier> getPrivates();

    void addPrivate(Soldier soldier);
}
