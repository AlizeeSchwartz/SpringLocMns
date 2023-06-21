package fr.mns.locmns.dto.user.user;

import fr.mns.locmns.domain.model.user.UserAffiliation;
import fr.mns.locmns.domain.model.user.UserGender;
import fr.mns.locmns.dto.user.status.StatusDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetails {
    private int id;
    private String lastname;
    private String firstname;
    private String email;
    private String login;
    private UserGender gender;
    private UserAffiliation affiliation;
    private String phone;
    // Ici on ajoute le details du status (id + name)
    private StatusDetails status;
}
