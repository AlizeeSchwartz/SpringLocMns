package fr.mns.locmns.domain.model.material;

import fr.mns.locmns.domain.model.common.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "material")
@Getter
@Setter

public class Material extends BaseEntity {

    private int registrationNumber;

    @ManyToOne
    @JoinColumn(name = "modelId")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "storageAreaId")
    private StorageArea storageArea;

    @ManyToOne
    @JoinColumn(name = "documentationId")
    private Documentation documentation;
}
