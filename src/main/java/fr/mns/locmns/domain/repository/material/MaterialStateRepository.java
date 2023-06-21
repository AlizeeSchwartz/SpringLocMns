package fr.mns.locmns.domain.repository.material;

import fr.mns.locmns.domain.model.material.MaterialState;
import fr.mns.locmns.domain.model.material.MaterialStateKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialStateRepository  extends JpaRepository<MaterialState, MaterialStateKey> {
}
