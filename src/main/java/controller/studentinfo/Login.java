/**   
 * @Title: Login.java  
 * @Package controller.studentinfo  
 * @Description: TODO  
 * @author wls   
 * @date 2014-10-6 下午4:12:06  
 * @version   
 */  

package controller.studentinfo;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.studentinfo.intf.StudentServiceIntf;

/**   
 * 类名称：Login   
 * 类描述：   
 * 创建人：wls
 * 创建时间：2014-10-6 下午4:12:06   
 * 修改人：wls
 * 修改时间：2014-10-6 下午4:12:06   
 * 修改备注：   
 * @version       
 */
@Controller
public class Login {
	
	  @Autowired
	  private StudentServiceIntf studentserviceintf;
	  @RequestMapping("/login2")
      public void login(HttpServletRequest request,
  			HttpServletResponse response, String account,String pwd){
    	   Student student =  studentserviceintf.login(account, pwd);
    	    try {
				if(student == null){
					response.getWriter().append("用户不存在");
					response.getWriter().flush();
				}else{
					response.getWriter().append(student.getStudentNo()+"："+student.getPasword());
					response.getWriter().flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      }
}
