package fr.mns.locmns.dto.material.material;

import fr.mns.locmns.dto.material.category.CategoryDetails;
import fr.mns.locmns.dto.material.documentation.DocumentationDetails;
import fr.mns.locmns.dto.material.model.ModelDetails;
import fr.mns.locmns.dto.material.storageArea.StorageAreaDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MaterialDetails {
    private int id;
    private int registrationNumber;


    private ModelDetails model;

    private CategoryDetails category;

    private StorageAreaDetails storageArea;

    private DocumentationDetails documentation;


}
