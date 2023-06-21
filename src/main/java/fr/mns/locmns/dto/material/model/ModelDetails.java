package fr.mns.locmns.dto.material.model;

import fr.mns.locmns.dto.material.brand.BrandDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModelDetails {
    private int id;

    private String name;
    private BrandDetails brand;

}
