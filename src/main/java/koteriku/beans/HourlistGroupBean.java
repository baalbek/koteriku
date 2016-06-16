package koteriku.beans;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/26/13
 * Time: 3:34 PM
 */
public class HourlistGroupBean {
    private int id;
    private String description;
    private String active;
    private String gnr;
    private String bnr;
    private double sumHours;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getGnr() {
        return gnr;
    }

    public void setGnr(String gnr) {
        this.gnr = gnr;
    }

    public String getBnr() {
        return bnr;
    }

    public void setBnr(String bnr) {
        this.bnr = bnr;
    }

    public double getSumHours() {
        return sumHours;
    }

    public void setSumHours(double sumHours) {
        this.sumHours = sumHours;
    }
}
