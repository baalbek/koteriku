package koteriku.models.mybatis;

import koteriku.beans.GeneralJournalBean;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/29/13
 * Time: 11:56 PM
 */
public interface GeneralJournalMapper {
    List<GeneralJournalBean> selectByBilag(int numItems);
    List<GeneralJournalBean> selectByDate(int numItems);
    void insertGeneralJournal(GeneralJournalBean gjb);
}