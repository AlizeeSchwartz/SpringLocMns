package fr.mns.loctraining.domain.model.material;

import fr.mns.loctraining.domain.model.common.BaseEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "documentation")
@Getter
@Setter

public class Documentation extends BaseEntity {

    private String description;
}
