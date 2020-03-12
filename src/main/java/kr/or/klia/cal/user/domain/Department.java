package kr.or.klia.cal.user.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Entity
public class Department {

    @Id @GeneratedValue
    @Column(name="department_id")
    private Long id;
    private String name;
    private int phone;
    private int fax;
    private Long parentId;
    private int orders;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<User> employee = new ArrayList<>();

    public void setCompany(Company company){
        this.company = company;
        company.getDepartment().add(this);
    }

}
