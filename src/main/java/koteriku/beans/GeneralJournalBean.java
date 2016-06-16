package koteriku.beans;

import java.time.LocalDate;
import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/29/13
 * Time: 11:56 PM
 */

/*
Table "regnskap.kassadagbok"
        Column |       Type        |                         Modifiers
        --------+-------------------+-----------------------------------------------------------
        oid    | integer           | not null default nextval('kassadagbok_oid_seq'::regclass)
        bilag  | bilag             |
        dato   | dato              |
        debit  | konto             |
        kredit | konto             |
        tekst  | kassadagbok_tekst |
        belop  | penger
*/
public class GeneralJournalBean {
    private int id;
    private int bilag;
    private LocalDate transactionDate;
    private int debit;
    private int credit;
    private String text;
    private double amount;

    public GeneralJournalBean() {}

    public GeneralJournalBean(int bilag,
                              LocalDate dx,
                              int credit,
                              int debit,
                              String text,
                              double amount) {
        this.bilag = bilag;
        this.transactionDate = dx;
        this.debit = debit;
        this.credit = credit;
        this.text = text;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBilag() {
        return bilag;
    }

    public void setBilag(int bilag) {
        this.bilag = bilag;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }
    public Date getTransactionDateSql() {
        return Date.valueOf(transactionDate);
    }

    public void setTransactionDateSql(Date transactionDateSql) {
        this.transactionDate = transactionDateSql.toLocalDate();
    }

    public int getDebit() {
        return debit;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
