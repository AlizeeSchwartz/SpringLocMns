package fr.mns.locmns.domain.model.material;

import fr.mns.locmns.domain.model.common.NamedEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "model")
@Getter
@Setter

public class Model extends NamedEntity {

    @ManyToOne
    @JoinColumn(name = "brandId" )
    private Brand brand;
}
