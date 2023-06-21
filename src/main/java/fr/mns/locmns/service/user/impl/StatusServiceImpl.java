package fr.mns.locmns.service.user.impl;

import fr.mns.locmns.domain.model.user.Status;
import fr.mns.locmns.domain.repository.user.StatusRepository;
import fr.mns.locmns.dto.user.status.StatusCreateRequest;
import fr.mns.locmns.dto.user.status.StatusDetails;
import fr.mns.locmns.dto.user.status.StatusUpdateRequest;
import fr.mns.locmns.service.user.StatusService;
import fr.mns.locmns.tools.exception.BadRequestException;
import fr.mns.locmns.tools.exception.NotFoundException;
import fr.mns.locmns.tools.utils.MappingUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

// Permet de définir la classe comment étant un Service (donc un Bean Spring)
@Service
@AllArgsConstructor
public class StatusServiceImpl implements StatusService {

    private final StatusRepository statusRepository;

    @Override
    public StatusDetails getDetails(Integer id) {
        Status status = statusRepository.findByIdNullSafe(id);
        if (status == null) {
            throw new NotFoundException();
        }

        return MappingUtils.getStatusDetails(status);
    }

    @Override
    public List<StatusDetails> getList() {
        List<Status> statusList = statusRepository.findAll();
        List<StatusDetails> statusDetailsList = new ArrayList<>();
        for (Status status : statusList) {
            StatusDetails details = MappingUtils.getStatusDetails(status);
            statusDetailsList.add(details);
        }

        return statusDetailsList;

        /*return statusRepository.findAll().stream()
                .map(this::getDetails)
                .collect(Collectors.toList());*/
    }

    @Override
    public StatusDetails create(StatusCreateRequest request) {
        if (!StringUtils.hasText(request.getName())) {
            throw new BadRequestException("Name should not be empty");
        }
        Status status = new Status();
        status.setName(request.getName());
        status = statusRepository.save(status);
        return MappingUtils.getStatusDetails(status);
    }

    @Override
    public StatusDetails update(Integer id, StatusUpdateRequest request) {
        Status status = statusRepository.findByIdNullSafe(id);
        if (status == null) {
            throw new NotFoundException();
        }
        if (!StringUtils.hasText(request.getName())) {
            throw new BadRequestException("Name should not be empty");
        }
        status.setName(request.getName());
        status = statusRepository.save(status);
        return MappingUtils.getStatusDetails(status);
    }

    @Override
    public void delete(Integer id) {
        Status status = statusRepository.findByIdNullSafe(id);
        if (status == null) {
            throw new NotFoundException();
        }
        statusRepository.delete(status);
    }
}
