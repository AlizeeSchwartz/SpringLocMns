package fr.mns.locmns.domain.repository.location;

import fr.mns.locmns.domain.model.location.Location;
import fr.mns.locmns.dto.location.LocationSearchRequest;

import java.util.List;

public interface LocationCustomRepository {
    List<Location> search(LocationSearchRequest request);
}
