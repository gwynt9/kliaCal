package kr.or.klia.cal.user.service;

import kr.or.klia.cal.user.domain.Company;
import kr.or.klia.cal.user.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;

    @Transactional
    public Long join(Company company){
        validateDuplicate(company);
        companyRepository.save(company);
        return company.getId();
    }

    @Transactional(readOnly = true)
    public List<Company> findCompanys() {
        return companyRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Company findOne(Long id) {
        return companyRepository.findOne(id);
    }

    private void validateDuplicate(Company company) {
        List<Company> findCompany = companyRepository.findByName(company.getName());
        if(!findCompany.isEmpty()) {
            throw new IllegalIdentifierException("company is empty");
        }
    }
}
