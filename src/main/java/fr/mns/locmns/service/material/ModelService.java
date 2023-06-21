package fr.mns.locmns.service.material;

import fr.mns.locmns.dto.material.model.ModelCreateRequest;
import fr.mns.locmns.dto.material.model.ModelDetails;
import fr.mns.locmns.dto.material.model.ModelUpdateRequest;

import java.util.List;

public interface ModelService {
    ModelDetails getDetails(Integer id);

    List<ModelDetails> getList(Integer brandId);

    ModelDetails create(ModelCreateRequest request);

    ModelDetails update(Integer id, ModelUpdateRequest request);

    void delete(Integer id);
}
