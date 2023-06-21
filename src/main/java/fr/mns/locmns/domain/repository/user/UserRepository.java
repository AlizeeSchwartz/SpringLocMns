package fr.mns.locmns.domain.repository.user;

import fr.mns.locmns.domain.model.user.User;
import fr.mns.locmns.domain.repository.common.BaseRepository;

public interface UserRepository extends BaseRepository<User>, UserCustomRepository {

    User findFirstByEmail(String email);

    User findFirstByEmailLikeOrFirstnameLike(String email, String firstname);

    User findFirstByEmailAndFirstnameAndLastname(String email, String firstname, String lastname);
}
