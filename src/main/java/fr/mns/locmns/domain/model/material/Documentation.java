package fr.mns.locmns.domain.model.material;

import fr.mns.locmns.domain.model.common.BaseEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "documentation")
@Getter
@Setter

public class Documentation extends BaseEntity {

    private String description;
}
