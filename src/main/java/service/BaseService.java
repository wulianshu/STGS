package service;

import dao.TestDao;
import model.BaseModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 文件名:BaseService.java
 * <p/>
 * 创建人:邓风森
 * <p/>
 * 创建时间:2014/9/29 20:40
 * <p/>
 * 文件描述:${TODO}
 */
@Service("baseService")
public class BaseService {
   @Resource(name = "testDao")
    TestDao testDao;
    public BaseModel queryTest(BaseModel baseModel){
        return testDao.queryTest(baseModel);
    }
}
