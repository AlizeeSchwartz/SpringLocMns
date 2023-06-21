package fr.mns.locmns.service.material;

import fr.mns.locmns.dto.material.documentation.DocumentationCreateRequest;
import fr.mns.locmns.dto.material.documentation.DocumentationDetails;
import fr.mns.locmns.dto.material.documentation.DocumentationUpdateRequest;

import java.util.List;

public interface DocumentationService {
    DocumentationDetails getDetails(Integer id);

    List<DocumentationDetails> getList();

    DocumentationDetails create(DocumentationCreateRequest request);

    DocumentationDetails update(Integer id, DocumentationUpdateRequest request);

    void delete(Integer id);
}
