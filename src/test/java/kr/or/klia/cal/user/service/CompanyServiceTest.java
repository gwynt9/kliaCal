package kr.or.klia.cal.user.service;

import kr.or.klia.cal.user.domain.Company;
import kr.or.klia.cal.user.repository.CompanyRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class CompanyServiceTest {

    @Autowired CompanyService companyService;
    @Autowired CompanyRepository companyRepository;
    //@Autowired EntityManager em;

    @Test
    //@Rollback(false)
    public void test() throws Exception{
        //given
        Company company = new Company();
        company.setName("생명보험협회2");

        //when
        Long companyId = companyService.join(company);

        //then
        //em.flush();
        assertEquals(company, companyRepository.findOne(companyId));
    }

    @Test
    public void testDup() throws Exception {
        //given
        Company company1 = new Company();
        company1.setName("한화생명");

        Company company2 = new Company();
        company2.setName("한화생명");

        //when
        companyService.join(company1);
        try {
            companyService.join(company2);
        } catch (IllegalStateException error) {
            return;
        }
        //then
        fail("exception!!!!!");

    }
}