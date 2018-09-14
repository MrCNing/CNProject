package com.Nine.Sky_lnn.control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Nine.Sky_lnn.bean.Ddxxb;
import com.Nine.Sky_lnn.bean.Fjxxb;
import com.Nine.Sky_lnn.bean.Glyxxb;
import com.Nine.Sky_lnn.common.Pager;
import com.Nine.Sky_lnn.service.DdxxbService;
import com.Nine.Sky_lnn.util.LogUtil;
import com.Nine.Sky_lnn.util.UUIDUtil;

@WebServlet("/DdclServlet")
public class DdclServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DdxxbService ddxxbService = new DdxxbService();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String m = request.getParameter("m");
		if("add".equals(m)) {
			add(request,response);
		}else if("delete".equals(m)) {
			delete(request,response);
		}else if("update".equals(m)) {
			update(request,response);
		}else if("listOne".equals(m)) {
			listOne(request,response);
		}else if("listClr".equals(m)) {
			listClr(request,response);
		}else if("listAll".equals(m)) {
			listAll(request,response);
		}
	}

	/**
	 * 添加订单
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void add(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		/*表单提交的信息*/
		String fjbh = request.getParameter("fjbh");
		String grbh = request.getParameter("grbh");
		String ydsj = request.getParameter("ydsj");
		String lxfs = request.getParameter("lxfs");
		String rzrs = request.getParameter("rzrs");
		String xm = request.getParameter("xm");
		String xb = request.getParameter("xb");
		String sfzh = request.getParameter("sfzh");
		/*预订时间转化为入住时间和退房时间*/
		String rzsj = "";
		String tfsj = "";
		try {
			rzsj = ydsj.substring(0, ydsj.indexOf(" - "));
			tfsj = ydsj.substring(ydsj.indexOf(" - ")+3);
		}catch(Exception e) {
			request.getRequestDispatcher("/XxglServlet?m=listAll&flag=first&status=failed").forward(request,response);
			return ;
		}
		/*给定订单编号、订单状态、处理人*/
		String ddbh = ""; 
		String ddzt = "待处理";
		String clr = "";
		/*处理入住人数*/
		int rzrs1 = 1;
		try {
			rzrs1 = Integer.parseInt(rzrs);
		}catch(Exception e) {
			request.getRequestDispatcher("/XxglServlet?m=listAll&flag=first&status=failed").forward(request,response);
			return ;
		}
		
		Ddxxb ddxxb = new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs1, xm, lxfs, xb, sfzh, clr);
		boolean b = ddxxbService.add(ddxxb);
		/*跳转位置*/
		if(b) {
			//添加成功
			LogUtil.info("订单添加成功！");
			LogUtil.info(request.getContextPath()+"/index.jsp");
//			response.sendRedirect(request.getContextPath()+"/index.jsp");
			request.getRequestDispatcher("/XxglServlet?m=listAll&flag=first&status=success").forward(request,response);
		}else {
			//添加失败
			LogUtil.info("订单添加失败！");
			request.getRequestDispatcher("/XxglServlet?m=listAll&flag=first&status=failed").forward(request,response);
		}
		
	}

	/**
	 * 删除订单
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ddbh = request.getParameter("ddbh");
		boolean b = ddxxbService.deleteById(ddbh);
		if(b) {
			//删除成功
			LogUtil.info("删除成功");
			request.getRequestDispatcher("/DdclServlet?m=listOne&flag=ddnr&pageNo=1&ddzt=&xm=&lxfs=&status=success").forward(request,response);
//			response.sendRedirect(request.getContextPath()+"/DdclServlet?m=listOne&flag=ddnr&pageNo=1&ddzt=&xm=&lxfs=");
		}else {
			//删除失败
			LogUtil.info("删除失败");
			request.getRequestDispatcher("/DdclServlet?m=listOne&flag=ddnr&pageNo=1&ddzt=&xm=&lxfs=&status=failed").forward(request,response);
		}
//		request.getRequestDispatcher("/YhdlxxbServlet?m=listOne&flag=zhwh&page=1&username=&sfbz=&zcsj=").forward(request,response);
	}

	/**
	 * 更改订单
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*表单提交的信息*/
		System.out.println("==============================");
		String ddbh = request.getParameter("ddbh");
		String fjbh = request.getParameter("fjbh");
		String grbh = request.getParameter("grbh");
		//String ydsj = request.getParameter("ydsj"); //预订时间
		String rzsj = request.getParameter("rzsj");
		String tfsj = request.getParameter("tfsj");
		String lxfs = request.getParameter("lxfs");
		String rzrs = request.getParameter("rzrs");
		String xm = request.getParameter("xm");
		String xb = request.getParameter("xb");
		String sfzh = request.getParameter("sfzh");
		String ddzt = request.getParameter("ddzt");
		/*预订时间转化为入住时间和退房时间*/
		//String rzsj = ydsj.substring(0, ydsj.indexOf(" - "));
		//String tfsj = ydsj.substring(ydsj.indexOf(" - ")+3);
		/*给定处理人*/
		Glyxxb glyxxb = (Glyxxb)request.getSession().getAttribute("glyxx");
		String clr = "";
		if(null != glyxxb) {
			clr = glyxxb.getGrbh();
		}
		/*处理入住人数*/
		int rzrs1 = Integer.parseInt(rzrs);
		Ddxxb ddxxb = new Ddxxb(ddbh, fjbh, grbh, ddzt, rzsj, tfsj, rzrs1, xm, lxfs, xb, sfzh, clr);
		System.out.println(ddxxb);
		boolean b = ddxxbService.update(ddxxb);
		/*跳转位置*/
		if(b) {
			//更新成功
			LogUtil.info("更新成功");
//			request.getRequestDispatcher("/pageAdmin/admin_ddnr.jsp").forward(request,response);
//			response.sendRedirect(request.getContextPath()+"/DdclServlet?m=listOne&flag=ddnr&pageNo=1&ddzt=&xm=&lxfs=");
			request.getRequestDispatcher("/DdclServlet?m=listOne&flag=ddnr&pageNo=1&ddzt=&xm=&lxfs=&status=success").forward(request,response);
		}else {
			//更新失败
			LogUtil.info("更新失败");
			request.getRequestDispatcher("/DdclServlet?m=listOne&flag=ddnr&pageNo=1&ddzt=&xm=&lxfs=&status=failed").forward(request,response);
		}
		
	}

	/**
	 *   模糊查询
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void listOne(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*获取模糊查找信息*/
		String ddzt = request.getParameter("ddzt");
		String xm = request.getParameter("xm");
		String lxfs = request.getParameter("lxfs");
		String pageNo = request.getParameter("pageNo");
		String flag = request.getParameter("flag");
		LogUtil.info("ddzt:"+ddzt+"xm:"+xm+"lxfs:"+lxfs+"pageNo:"+pageNo+"flag:"+flag);
		//创建用户和页对象
		Ddxxb ddxxb = new Ddxxb(ddzt,xm,lxfs);
		//Pager pager = (Pager)request.getSession().getAttribute("pager");
		Pager pager = new Pager();
		request.getSession().setAttribute("pager",pager);
		//设置当前页
		if(null != pageNo) {
			pager.setPageNo(Integer.parseInt(pageNo));
		}
		//存入map对象
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("user", ddxxb);
		map.put("pager", pager);
		//将结果保存到list
		ArrayList<Ddxxb> list = ddxxbService.listByMap(map);
		request.setAttribute("list", list);
		/*for(Ddxxb i : list) {
			System.out.println(i);
		}*/
		
		if("ddnr".equals(flag)) {
			request.setAttribute("ddList", list);
			request.getRequestDispatcher("/pageAdmin/admin_ddnr.jsp").forward(request,response);
		}else {
//			request.getRequestDispatcher("/pages_admin/accountMgr.jsp").forward(request,response);
			request.getRequestDispatcher("/pageAdmin/admin_ddnr.jsp").forward(request,response);
		}
		
	}
	
	/**
	 * 查询订单处理人
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	public void listClr(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Glyxxb glyxxb = (Glyxxb)request.getSession().getAttribute("glyxx");
		if(null != glyxxb) {
			/*获取模糊查找信息*/
			String ddzt = request.getParameter("ddzt");
			String xm = request.getParameter("xm");
			String lxfs = request.getParameter("lxfs");
			String pageNo = request.getParameter("pageNo");
			String grbh = glyxxb.getGrbh();
			//创建用户和页对象
			Ddxxb ddxxb = new Ddxxb(ddzt,xm,lxfs);
			ddxxb.setGrbh(grbh);
			//Pager pager = (Pager)request.getSession().getAttribute("pager");
			Pager pager = new Pager();
			request.getSession().setAttribute("pager",pager);
			//设置当前页
			if(null != pageNo) {
				pager.setPageNo(Integer.parseInt(pageNo));
			}
			//存入map对象
			Map<String, Object> map = new HashMap<String,Object>();
			map.put("user", ddxxb);
			map.put("pager", pager);
			
			ArrayList<Ddxxb> list = ddxxbService.selectByClr(map);
			request.setAttribute("clrList", list);
			request.getRequestDispatcher("/pageAdmin/admin_cljl.jsp").forward(request,response);
		}
	}
	
	/**
	 *  查找全部
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void listAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*获取模糊查找信息*/
		String ddzt = request.getParameter("ddzt");
		String xm = request.getParameter("xm");
		String lxfs = request.getParameter("lxfs");
		
		Ddxxb ddxxb = new Ddxxb(ddzt,xm,lxfs);
		
		ArrayList<Ddxxb> list = ddxxbService.listByObj(ddxxb);
		for(Ddxxb i : list) {
			System.out.println(i);
		}
		request.setAttribute("list", list);
		
//		if("zhcx".equals(flag)) {
//			request.getRequestDispatcher("/pages_admin/accountList.jsp").forward(request,response);
//		}else {
//			request.getRequestDispatcher("/pages_admin/accountMgr.jsp").forward(request,response);
//		}
		
		
	}


}