package src.Lab._04_CarShopExtended_02;

import java.io.Serializable;

public interface Car extends Serializable {
    public Integer TIRES = 4;

    String getModel();

    String getColor();

    Integer getHorsePower();

    String countryProduced();
}
