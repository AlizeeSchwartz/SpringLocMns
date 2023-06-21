package fr.mns.locmns.domain.model.material;

import fr.mns.locmns.domain.model.common.NamedEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "category")
@Getter
@Setter
public class Category extends NamedEntity {
}
