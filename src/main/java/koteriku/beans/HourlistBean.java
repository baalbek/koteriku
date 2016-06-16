package koteriku.beans;

import java.sql.Date;
import java.time.LocalDate;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/26/13
 * Time: 3:29 PM
 */
public class HourlistBean {
    //nsert into regnskap.timeliste (fnr, dato, timer, gruppe, fra_klokken, til_klokken

    private int oid;
    private int invoiceNr;
    private LocalDate localDate;
    private double hours;
    private int groupId;
    private String fromTime;
    private String toTime;
    private String description;

    public int getInvoiceNr() {
        return invoiceNr;
    }

    public void setInvoiceNr(int invoiceNr) {
        this.invoiceNr = invoiceNr;
    }

    //region Dates
    public Date getSqlDate() {
        return Date.valueOf(localDate);
    }

    public void setSqlDate(Date sqlDate) {
        this.localDate = sqlDate.toLocalDate();
    }
    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    //endregion

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
