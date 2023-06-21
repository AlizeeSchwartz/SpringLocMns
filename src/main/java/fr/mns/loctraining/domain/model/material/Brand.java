package fr.mns.loctraining.domain.model.material;

import fr.mns.loctraining.domain.model.common.NamedEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "brand")
@Getter
@Setter
public class Brand extends NamedEntity {

}
