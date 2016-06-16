package koteriku.beans;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/27/13
 * Time: 3:40 PM
 */
public class InvoiceBean {

    private int invoiceNum;
    private String description;
    private String customerName;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
   }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }
}
