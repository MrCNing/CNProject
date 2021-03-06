package com.Nine.Sky_lnn.control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nine.Sky_lnn.bean.Dlxxb;
import com.Nine.Sky_lnn.bean.Glyxxb;
import com.Nine.Sky_lnn.service.DlxxbService;
import com.Nine.Sky_lnn.service.GlyxxbService;
import com.Nine.Sky_lnn.util.EncryptTool;

/**
 * Servlet implementation class GlyxxbServlet
 */
@WebServlet("/GlyxxbServlet")
public class GlyxxbServlet extends HttpServlet {
	private GlyxxbService glyService=new GlyxxbService();
	private DlxxbService dlxxService=new DlxxbService();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		updateAdmin(request,response);
	}

	private void updateAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String zh=request.getParameter("zh");
		String yhm=request.getParameter("yhm");
		String pwd=request.getParameter("pwd");
		String lxfs=request.getParameter("lxfs");
		
		
		Glyxxb gly = new Glyxxb();
		Dlxxb glydl = new Dlxxb();
		
		gly.setZh(zh);
		glydl.setZh(zh);
		
		gly=glyService.select(gly);
		glydl=dlxxService.selectByZh(zh);
		
		gly.setYhm(yhm);
		gly.setLxfs(lxfs);
		
		if("".equals(pwd)!=true) {
			pwd=pwd.trim();
			pwd=EncryptTool.getEncStr(pwd);
			glydl.setPwd(pwd);
		}
		
		request.getSession().setAttribute("glyxx", gly);
		
		glyService.updatejbxx(gly);
		dlxxService.updateMm(glydl);
		
		request.getRequestDispatcher("/pageAdmin/admin_jbxx.jsp?status=success").forward(request, response);
	}
}
