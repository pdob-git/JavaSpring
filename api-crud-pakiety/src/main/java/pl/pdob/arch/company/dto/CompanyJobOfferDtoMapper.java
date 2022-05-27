package pl.pdob.arch.company.dto;

import org.springframework.stereotype.Service;
import pl.pdob.arch.joboffer.JobOffer;

@Service
public class CompanyJobOfferDtoMapper {
    public CompanyJobOfferDto map(JobOffer jobOffer) {
        CompanyJobOfferDto dto = new CompanyJobOfferDto();
        dto.setId(jobOffer.getId());
        dto.setTitle(jobOffer.getTitle());
        dto.setLocation(jobOffer.getLocation());
        dto.setMinSalary(jobOffer.getMinSalary());
        dto.setMaxSalary(jobOffer.getMaxSalary());
        return dto;
    }
}
