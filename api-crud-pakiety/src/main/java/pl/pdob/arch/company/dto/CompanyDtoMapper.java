package pl.pdob.arch.company.dto;

import org.springframework.stereotype.Service;
import pl.pdob.arch.company.Company;

@Service
public class CompanyDtoMapper {
    public CompanyDto map(Company company) {
        CompanyDto dto = new CompanyDto();
        dto.setId(company.getId());
        dto.setName(company.getName());
        dto.setDescription(company.getDescription());
        dto.setCity(company.getCity());
        dto.setEmployees(company.getEmployees());
        dto.setTelephone(company.getTelephone());
        dto.setEmail(company.getEmail());
        return dto;
    }
}
