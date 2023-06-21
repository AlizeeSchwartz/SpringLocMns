package fr.mns.locmns.service.material;

import fr.mns.locmns.dto.material.brand.BrandCreateRequest;
import fr.mns.locmns.dto.material.brand.BrandDetails;
import fr.mns.locmns.dto.material.brand.BrandUpdateRequest;

import java.util.List;

public interface BrandService {
    BrandDetails getDetails(Integer id);

    List<BrandDetails> getList();

    BrandDetails create(BrandCreateRequest request);

    BrandDetails update(Integer id, BrandUpdateRequest request);

    void delete(Integer id);
}
