package kr.or.klia.cal.user.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Getter
@Entity
//@Table(name="USER")
public class user {

    @Id
    private String email;
    private String name;
    private String department;
    private String position;
    private int employeeNo;
    private int phone;
    private int cellPhone;
    private int birthday;
    private String permission;
    private String sex;
    private String company;
}