package fr.mns.locmns.service.utils;

import fr.mns.locmns.dto.utils.EnumerationDetails;

import java.util.List;

public interface EnumerationService {

    List<EnumerationDetails> getGenders();

    List<EnumerationDetails> getAffiliations();

    List<EnumerationDetails> getRentalStatus();

}
