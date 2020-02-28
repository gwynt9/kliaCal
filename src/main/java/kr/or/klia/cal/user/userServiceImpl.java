package kr.or.klia.cal.user;

import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Getter @Setter
@Service
public class userServiceImpl implements userService{

//    @NonNull
    private String email;
//    @NonNull
    private String name;
    private String department;
    private String position;
    private int employeeNo;
    private int phone;
    private int cellPhone;
    private int birthday;
    private String permission;
    private String sex;
    private String comment;

}