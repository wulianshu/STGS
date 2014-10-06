/**   
 * @Title: StudentServiceImpl.java  
 * @Package service.studentinfoimpl  
 * @Description: TODO  
 * @author wls   
 * @date 2014-10-6 下午4:47:10  
 * @version   
 */  

package service.studentinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;

import dao.studentinfo.intf.StudentDaoIntf;
import model.Student;
import service.studentinfo.intf.StudentServiceIntf;

/**   
 * 类名称：StudentServiceImpl   
 * 类描述：   
 * 创建人：wls
 * 创建时间：2014-10-6 下午4:47:10   
 * 修改人：wls
 * 修改时间：2014-10-6 下午4:47:10   
 * 修改备注：   
 * @version       
 */

public class StudentServiceImpl implements StudentServiceIntf {
	@Autowired
	private StudentDaoIntf studentdao;

	/* (non-Javadoc)  
	 * <p>Title: login</p>  
	 * <p>Description: </p>  
	 * @param account
	 * @param pwd
	 * @return  
	 * @see service.studentinfointf.StudentServiceIntf#login(java.lang.String, java.lang.String)  
	 */

	@Override
	public Student login(String account, String pwd) {
		// TODO Auto-generated method stub
		return studentdao.login(account, pwd);
	}

}
