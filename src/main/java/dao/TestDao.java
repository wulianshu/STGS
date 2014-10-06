package dao;

import model.BaseModel;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * 文件名:TestDao.java
 * <p/>
 * 创建人:邓风森
 * <p/>
 * 创建时间:2014/9/29 21:19
 * <p/>
 * 文件描述:${TODO}
 */
//因为BaseDao被占用了 所以这里建了一个testDao  你们的命名规范要统一
@Component("testDao")
public class TestDao extends BaseDao{

    public BaseModel queryTest(BaseModel baseModel){
        //hibernate 有多种查询方法，这里列出的是最简单的hql语句编写  ，你们要自己查一下hibernate的其他查询方法运用
        String hql="select a from BaseModel a where a.loginPassword='"+baseModel.getLoginPassword()+"' and a.loginName='"+baseModel.getLoginName()+"'";
        //hibernateTemplate的find(String hql)返回类型为List这些要
        return (BaseModel) super.getHibernateTemplate().find(hql).get(0);
    }
}
