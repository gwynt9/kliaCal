package kr.or.klia.cal.user;

public interface UserService {

    String getName();

    void setName(String name);

    public String getDepartment();

    public void setDepartment(String department);

    public String getPosition();

    public void setPosition(String position);

    public int getEmployeeNo();

    public void setEmployeeNo(int employeeNo);

    public int getPhone();

    public void setPhone(int phone);

    public int getCellPhone();

    public void setCellPhone(int cellPhone);

    public String getEmail();

    public void setEmail(String email);

    public int getBirthday();

    public void setBirthday(int birthday);

    public String getPermission();

    public void setPermission(String permission);

    public String getSex();

    public void setSex(String sex);

    public String getComment();

    public void setComment(String comment);
}