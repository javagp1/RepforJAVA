package cn.fx.jlx.springMVC.springMVC.pojo;

public class Orderlist {
    private String olid;

    private Integer gdid;

    private Integer gdcount;

    private Integer gsid;

    private Double price;

    private Integer olstatus;

    private String ofid;

    public String getOlid() {
        return olid;
    }

    public void setOlid(String olid) {
        this.olid = olid;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getGdcount() {
        return gdcount;
    }

    public void setGdcount(Integer gdcount) {
        this.gdcount = gdcount;
    }

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getOlstatus() {
        return olstatus;
    }

    public void setOlstatus(Integer olstatus) {
        this.olstatus = olstatus;
    }

    public String getOfid() {
        return ofid;
    }

    public void setOfid(String ofid) {
        this.ofid = ofid;
    }
}