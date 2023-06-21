package fr.mns.locmns.domain.repository.common;

import fr.mns.locmns.domain.model.common.NamedEntity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface NamedRepository<T extends NamedEntity> extends BaseRepository<T> {
    T findFirstByName(String name);

}
