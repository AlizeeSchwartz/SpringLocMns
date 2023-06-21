package fr.mns.loctraining.domain.model.material;

import fr.mns.loctraining.domain.model.common.NamedEntity;
import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.jar.Attributes;

@Entity(name = "category")
@Getter
@Setter
public class Category extends NamedEntity {
}
