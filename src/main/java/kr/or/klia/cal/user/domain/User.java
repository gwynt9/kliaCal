package kr.or.klia.cal.user.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Entity
public class User {

    @Id @GeneratedValue
    @Column(name="user_id")
    private Long id;
    private String email;
    private String name;
    private String position;
    private int employeeNo;
    private int phone;
    private int cellPhone;
    private int publicPhone;
    private int birthday;
    private String permission;
    private String sex;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    private Department department;
    @OneToMany(mappedBy = "attendee", cascade = CascadeType.ALL)
    private List<Schedule> schedules = new ArrayList<>();

    public void setDepartment(Department department){
        this.department = department;
        department.getEmployee().add(this);
    }

    public void setSchedules(Schedule schedule){
        this.schedules.add(schedule);
    }
}