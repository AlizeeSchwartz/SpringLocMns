package fr.mns.locmns.domain.model.material;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class MaterialStateKey implements Serializable {
    @Column
    private Integer materialId;
    @Column
    private Integer stateId;
}
