package service;

import dao.DemoServiceDAO;
import domain.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by huangzhenwei on 2017/09/24.
 */
@Service
public class DemoServiceService {
@Autowired
    private DemoServiceDAO demoServiceDAO;

public DemoService getDemoService(Integer id){
    int i=0;
    DemoService demoService = demoServiceDAO.selectDemoService(id);
    return demoService;
}


}
