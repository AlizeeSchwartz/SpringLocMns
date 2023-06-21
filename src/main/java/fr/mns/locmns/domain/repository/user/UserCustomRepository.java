package fr.mns.locmns.domain.repository.user;

import fr.mns.locmns.domain.model.user.User;
import fr.mns.locmns.dto.user.user.UserSearchRequest;

import java.util.List;

public interface UserCustomRepository {
    List<User> search(UserSearchRequest request);
}
