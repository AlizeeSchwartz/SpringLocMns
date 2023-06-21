package fr.mns.locmns.dto.user.user;

import fr.mns.locmns.domain.model.user.UserAffiliation;
import fr.mns.locmns.domain.model.user.UserGender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSearchRequest {
    private String search;
    private UserGender gender;
    private UserAffiliation affiliation;
    private Integer statusId;
}
