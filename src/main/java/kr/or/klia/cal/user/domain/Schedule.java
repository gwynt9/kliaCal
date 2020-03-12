package kr.or.klia.cal.user.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@Getter
@Entity
public class Schedule {

    @Id @GeneratedValue
    @Column(name="schedule_id")
    private Long id;
    private String name;
    private String location;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    //엔티티 클래스 개발1 참고
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User attendee;
    //private User creater;
    //private User finalUpdater:
    private String publicYN;
    private String type;
    private String comment;
    private byte file;
    private LocalDateTime alram;
    private AlramMethod alramMethod; //mail,sms

//    public void SetAttendee(User user){
//        this.attendee
//    }

    //todo : location api 연동
    //todo : type List<String>으로 변경
}
