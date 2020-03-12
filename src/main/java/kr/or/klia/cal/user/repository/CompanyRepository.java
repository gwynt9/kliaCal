package kr.or.klia.cal.user.repository;

import kr.or.klia.cal.user.domain.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CompanyRepository {

    private final EntityManager em;

    public void save(Company company){
        em.persist(company);
    }

    public Company findOne(Long id){
        return em.find(Company.class, id);
    }

    public List<Company> findAll(){
        return em.createQuery("select c from Company c", Company.class)
                .getResultList();
    }

    public List<Company> findByName(String name){
        return em.createQuery("select c from Company c where c.name = :name", Company.class)
                .setParameter("name", name)
                .getResultList();
    }
}
