package koteriku.models.mybatis;

import koteriku.beans.HourlistGroupBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: rcs
 * Date: 5/26/13
 * Time: 3:32 PM
 */
public interface HourlistGroupMapper {
    List<HourlistGroupBean> selectHourlistGroups(@Param("showInactive") boolean showInactive);
    List<HourlistGroupBean> selectGroupBySpec(@Param("invoice") int invoice);
    void insertHourlistGroup(HourlistGroupBean hourlistGroup);
    void toggleGroup(@Param("oid") int oid, @Param("isActive") String isActive);
}
