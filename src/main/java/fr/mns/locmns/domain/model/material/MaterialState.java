package fr.mns.locmns.domain.model.material;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "material_state")
@Getter
@Setter
public class MaterialState {
    @EmbeddedId
    private MaterialStateKey id;

    @ManyToOne
    @MapsId("materielId")
    @JoinColumn(name = "materialId")
    private Material material;

    @ManyToOne
    @MapsId("stateId")
    @JoinColumn(name = "stateId")
    private State state;

    private Date date;

}
