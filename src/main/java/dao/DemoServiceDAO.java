package dao;

import domain.DemoService;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by huangzhenwei on 2017/09/24.
 */
@Mapper
public interface DemoServiceDAO {
    DemoService selectDemoService(@Param("id")Integer id);

}
