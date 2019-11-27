package cn.fx.jlx.springMVC.springMVC.pojo;

public class Stuser {
    private Integer stuserid;

    private String slogname;

    private String spassword;

    private String salt;

    private Integer status;

    private Integer stid;

    public Integer getStuserid() {
        return stuserid;
    }

    public void setStuserid(Integer stuserid) {
        this.stuserid = stuserid;
    }

    public String getSlogname() {
        return slogname;
    }

    public void setSlogname(String slogname) {
        this.slogname = slogname;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }
}