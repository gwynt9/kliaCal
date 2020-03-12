package kr.or.klia.cal.user.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Company {

    @Id
    @GeneratedValue
    @Column(name="company_id")
    private Long id;
    private String name;
    private String type;
    private int orders;
    private String code;
    private byte logo;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @OneToMany(mappedBy = "company", cascade = CascadeType.ALL)
    private List<Department> department = new ArrayList<>();

}