/**   
 * @Title: StudentDaoImpl.java  
 * @Package dao.studentinfoimpl  
 * @Description: TODO  
 * @author wls   
 * @date 2014-10-6 下午4:49:38  
 * @version   
 */  

package dao.studentinfo.impl;

import org.springframework.stereotype.Component;

import model.Student;
import dao.BaseDao;
import dao.studentinfo.intf.StudentDaoIntf;

/**   
 * 类名称：StudentDaoImpl   
 * 类描述：   
 * 创建人：wls
 * 创建时间：2014-10-6 下午4:49:38   
 * 修改人：wls
 * 修改时间：2014-10-6 下午4:49:38   
 * 修改备注：   
 * @version       
 */
@Component(value="studentDao")
public class StudentDaoImpl extends BaseDao implements StudentDaoIntf {
/**
 * 登录
 */
	@Override
	public Student login(String account, String pwd) {
		// TODO Auto-generated method stub
		Object[] objects = new Object[]{account,pwd};
		 Student student  = (Student) super.getUnique("fromStudent where studentNo=? and pasword=?", objects);
		return student;
	}
}
