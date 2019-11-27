package cn.fx.jlx.springMVC.springMVC.pojo;

public class Carouselimg {
    private Integer cimgid;

    private String cimgurl;

    private Integer gdid;

    private Double ctime;

    private Double cimgshowtime;

    public Integer getCimgid() {
        return cimgid;
    }

    public void setCimgid(Integer cimgid) {
        this.cimgid = cimgid;
    }

    public String getCimgurl() {
        return cimgurl;
    }

    public void setCimgurl(String cimgurl) {
        this.cimgurl = cimgurl;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Double getCtime() {
        return ctime;
    }

    public void setCtime(Double ctime) {
        this.ctime = ctime;
    }

    public Double getCimgshowtime() {
        return cimgshowtime;
    }

    public void setCimgshowtime(Double cimgshowtime) {
        this.cimgshowtime = cimgshowtime;
    }
}