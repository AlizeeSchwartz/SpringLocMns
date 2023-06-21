package fr.mns.locmns.service.material;

import fr.mns.locmns.dto.material.storageArea.StorageAreaCreateRequest;
import fr.mns.locmns.dto.material.storageArea.StorageAreaDetails;
import fr.mns.locmns.dto.material.storageArea.StorageAreaUpdateRequest;

import java.util.List;

public interface StorageAreaService {
    StorageAreaDetails getDetails(Integer id);

    List<StorageAreaDetails> getList();

    StorageAreaDetails create(StorageAreaCreateRequest request);

    StorageAreaDetails update(Integer id, StorageAreaUpdateRequest request);

    void delete(Integer id);
}
