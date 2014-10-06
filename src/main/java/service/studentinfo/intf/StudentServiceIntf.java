/**   
 * @Title: StudentServiceint.java  
 * @Package service.studentinfointf  
 * @Description: TODO  
 * @author wls   
 * @date 2014-10-6 下午4:44:55  
 * @version   
 */  

package service.studentinfo.intf;

import model.Student;

/**   
 * 类名称：StudentServiceint   
 * 类描述：   
 * 创建人：wls
 * 创建时间：2014-10-6 下午4:44:55   
 * 修改人：wls
 * 修改时间：2014-10-6 下午4:44:55   
 * 修改备注：   
 * @version       
 */

public interface StudentServiceIntf {
  public Student login(String account,String pwd);
}
