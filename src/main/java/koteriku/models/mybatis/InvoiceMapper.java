package koteriku.models.mybatis;

import koteriku.beans.InvoiceBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/27/13
 * Time: 4:05 PM
 */
public interface InvoiceMapper {
    List<InvoiceBean> selectInvoices();

    void updateVoucher(@Param("bilag") int bilag,
                       @Param("fnr") int fnr);
}
