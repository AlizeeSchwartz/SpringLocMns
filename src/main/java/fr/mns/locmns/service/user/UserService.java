package fr.mns.locmns.service.user;

import fr.mns.locmns.dto.user.user.UserCreateRequest;
import fr.mns.locmns.dto.user.user.UserDetails;
import fr.mns.locmns.dto.user.user.UserSearchRequest;
import fr.mns.locmns.dto.user.user.UserUpdateRequest;

import java.util.List;

public interface UserService {
    UserDetails getDetails(Integer id);

    List<UserDetails> getList();

    UserDetails create(UserCreateRequest request);

    UserDetails update(Integer id, UserUpdateRequest request);

    void delete(Integer id);

    List<UserDetails> search(UserSearchRequest request);
}
