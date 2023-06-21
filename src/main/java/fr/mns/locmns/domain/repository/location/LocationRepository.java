package fr.mns.locmns.domain.repository.location;

import fr.mns.locmns.domain.model.location.Location;
import fr.mns.locmns.domain.repository.common.BaseRepository;

public interface LocationRepository extends BaseRepository<Location>, LocationCustomRepository {
}
