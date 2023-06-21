package fr.mns.locmns.domain.repository.material;

import fr.mns.locmns.domain.model.material.Material;
import fr.mns.locmns.dto.material.material.MaterialSearchRequest;

import java.util.List;

public interface MaterialCustomRepository {
    List<Material> search(MaterialSearchRequest request);
}
