package fr.mns.locmns.domain.repository.material;

import fr.mns.locmns.domain.model.material.Model;
import fr.mns.locmns.domain.repository.common.NamedRepository;

import java.util.List;

public interface ModelRepository extends NamedRepository<Model> {

    List<Model> findByBrandId(Integer id);
}
