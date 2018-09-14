package com.Nine.Sky_lnn.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

import org.apache.taglibs.standard.tag.common.sql.DataSourceUtil;

import com.Nine.Sky_lnn.bean.Dlxxb;
import com.Nine.Sky_lnn.bean.Yhxxb;
import com.Nine.Sky_lnn.service.DlxxbService;
import com.Nine.Sky_lnn.service.GlyxxbService;
import com.Nine.Sky_lnn.service.YhxxbService;
import com.Nine.Sky_lnn.util.DateUtil;
import com.Nine.Sky_lnn.util.EncryptTool;
import com.Nine.Sky_lnn.util.UUIDUtil;

import oracle.net.aso.a;

/**
 * Servlet implementation class zhuceServlet
 */
@WebServlet("/zhuceServlet")
public class zhuceServlet extends HttpServlet {
	private DlxxbService dlxxbService=new DlxxbService();
	private YhxxbService yhxxbService=new YhxxbService();
	private GlyxxbService glyxxbService =new GlyxxbService();
	private EncryptTool encryptTool=new EncryptTool();
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*获取zh，yhm，密码*/
		String zh=request.getParameter("userEntity.userCode");
		String yhm=request.getParameter("userEntity.userCode2");
		String pwd=encryptTool.getEncStr(request.getParameter("userEntity.password"));
	    /*个人编号*/
		String grbh = UUIDUtil.getUuid();
		/*新建dlxxb和yhxxb对象*/
		Dlxxb dlxxb=new Dlxxb(grbh, zh, pwd, null, null);
		Yhxxb yhxxb=new Yhxxb(grbh, zh, yhm, null, null, null);
		/*判断登录表，用户表，管理员表是否有这个账号*/
		boolean a = dlxxbService.isExist(dlxxb);
		boolean b = yhxxbService.isExist(yhxxb);
		boolean c= yhxxbService.isExistYhm(yhxxb);
		if (!(b&&a&&c)) {
			/*Service添加对象*/
			dlxxbService.add(dlxxb);
			yhxxbService.add(yhxxb);
			/*跳转登录界面*/
//			response.sendRedirect(request.getContextPath() + "/login.jsp");
			request.getRequestDispatcher("/login.jsp?status=success").forward(request, response);
		}else {
			
			/*跳回注册界面*/
//			response.sendRedirect(request.getContextPath() + "/register.jsp");
			request.getRequestDispatcher("/register.jsp?status=failed").forward(request, response);
			
		}
		
		 
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
