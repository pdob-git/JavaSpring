package pl.pdob.arch.joboffer;

import org.springframework.stereotype.Service;
import pl.pdob.arch.joboffer.dto.JobOfferDto;
import pl.pdob.arch.joboffer.dto.JobOfferDtoMapper;

import java.util.Optional;

@Service
class JobOfferService {
    private final JobOfferRepository jobOfferRepository;
    private final JobOfferDtoMapper jobOfferDtoMapper;

    public JobOfferService(JobOfferRepository jobOfferRepository, JobOfferDtoMapper jobOfferDtoMapper) {
        this.jobOfferRepository = jobOfferRepository;
        this.jobOfferDtoMapper = jobOfferDtoMapper;
    }

    Optional<JobOfferDto> getOfferById(Long id) {
        return jobOfferRepository.findById(id)
                .map(jobOfferDtoMapper::map);
    }
}
