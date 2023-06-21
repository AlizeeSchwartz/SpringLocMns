package fr.mns.locmns.service.utils.impl;

import fr.mns.locmns.domain.model.location.LocationStatus;
import fr.mns.locmns.domain.model.user.UserAffiliation;
import fr.mns.locmns.domain.model.user.UserGender;
import fr.mns.locmns.dto.utils.EnumerationDetails;
import fr.mns.locmns.service.utils.EnumerationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnumerationServiceImpl implements EnumerationService {

    @Override
    public List<EnumerationDetails> getGenders() {
        List<EnumerationDetails> list = new ArrayList<>();
        for (UserGender value : UserGender.values()) {
            EnumerationDetails details = new EnumerationDetails();
            details.setValue(value.toString());
            details.setLabel(value.getName());
            list.add(details);
        }
        return list;
    }

    @Override
    public List<EnumerationDetails> getAffiliations() {
        List<EnumerationDetails> list = new ArrayList<>();
        for (UserAffiliation value : UserAffiliation.values()) {
            EnumerationDetails details = new EnumerationDetails();
            details.setValue(value.toString());
            details.setLabel(value.getName());
            list.add(details);
        }
        return list;
    }

    @Override
    public List<EnumerationDetails> getRentalStatus() {
        List<EnumerationDetails> list = new ArrayList<>();
        for (LocationStatus value : LocationStatus.values()) {
            EnumerationDetails details = new EnumerationDetails();
            details.setValue(value.toString());
            details.setLabel(value.getName());
            list.add(details);
        }
        return list;
    }
}
