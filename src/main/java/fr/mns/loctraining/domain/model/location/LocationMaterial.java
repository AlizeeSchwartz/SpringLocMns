package fr.mns.loctraining.domain.model.location;

import fr.mns.loctraining.domain.model.material.Material;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "location_material")
@Getter
@Setter
public class LocationMaterial {

    // Annotation qui permet de spécifier l'id composite
    @EmbeddedId
    private LocationMaterialKey id;

    @ManyToOne
    // Permet de préciser que cette relation fait partie de la clé composite et donc
    // doit prendre le même nom que dans la clé composite de LocationMaterialKey
    @MapsId("locationId")
    //join column traditionnel qui va prendre le nom de la colone en bdd
    @JoinColumn(name = "locationId")
    private Location location;

    @ManyToOne
    @MapsId("materialId")
    @JoinColumn(name = "materialId")
    private Material material;
}
