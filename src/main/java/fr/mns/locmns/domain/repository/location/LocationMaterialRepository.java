package fr.mns.locmns.domain.repository.location;

import fr.mns.locmns.domain.model.location.LocationMaterial;
import fr.mns.locmns.domain.model.location.LocationMaterialKey;
import org.springframework.data.jpa.repository.JpaRepository;

// L'entité est de type LocationMaterial, et l'id (composite) de type LocationMaterialKey
public interface LocationMaterialRepository extends JpaRepository<LocationMaterial, LocationMaterialKey> {
}
