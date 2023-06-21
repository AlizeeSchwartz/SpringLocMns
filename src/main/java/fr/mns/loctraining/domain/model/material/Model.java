package fr.mns.loctraining.domain.model.material;

import fr.mns.loctraining.domain.model.common.NamedEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Model extends NamedEntity {

    @ManyToOne
    @JoinColumn(name = "brandId" )
    private Brand brand;
}
