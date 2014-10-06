/**   
 * @Title: StudentDaoIntf.java  
 * @Package dao.studentinfointf  
 * @Description: TODO  
 * @author wls   
 * @date 2014-10-6 下午4:49:09  
 * @version   
 */  

package dao.studentinfo.intf;

import model.Student;

/**   
 * 类名称：StudentDaoIntf   
 * 类描述：   
 * 创建人：wls
 * 创建时间：2014-10-6 下午4:49:09   
 * 修改人：wls
 * 修改时间：2014-10-6 下午4:49:09   
 * 修改备注：   
 * @version       
 */

public interface StudentDaoIntf {
          public Student  login(String account,String pwd);
}