package fr.mns.locmns.domain.repository.material;

import fr.mns.locmns.domain.model.material.Material;
import fr.mns.locmns.domain.repository.common.BaseRepository;

public interface MaterialRepository extends BaseRepository<Material>, MaterialCustomRepository {
}
