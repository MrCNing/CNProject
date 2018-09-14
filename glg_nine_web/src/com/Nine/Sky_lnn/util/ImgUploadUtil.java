package com.Nine.Sky_lnn.util;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadBase;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class ImgUploadUtil {

	/**
	 * 图片上传
	 * @param request
	 * @param uploadPath 图片上传位置（可以是相对于项目的路径，如 "/upload";也可以是绝对路径，如"c:/upload"） 
	 * @return 返回图片名字，或返回 代码值0（上传失败）、1（不是图片文件）、2（图片太大，最多只能为4M）
	 */
	public static String uploadImage(HttpServletRequest request, String uploadPath) {
		String retStr = "0";//上传失败
		//判断请求内容是否是 multipart/from-data 类型
		if(ServletFileUpload.isMultipartContent(request)) {
			DiskFileItemFactory fif = new DiskFileItemFactory();
			ServletFileUpload upload = new ServletFileUpload(fif);
			upload.setSizeMax(1024*1024*4);//设置上传文件最大大小为4M
			
			try {
				List<FileItem> items = upload.parseRequest(request);
				Iterator<FileItem> it = items.iterator();
				while(it.hasNext()) {
					FileItem item = it.next();
					if(item.isFormField() == false) {
						String fileName = item.getName();
						if(StrUtil.isNotEmpty(fileName)) {
							if(ImageIO.read(item.getInputStream()) != null) {
								fileName = UUIDUtil.getUuid() + fileName;
								File file = new File(uploadPath, fileName);
								item.write(file);
								retStr = fileName;//返回文件名
							}else {
								retStr = "1";//"不是图片文件";
							}
						}
					}
				}
				
			} catch (FileUploadBase.SizeLimitExceededException e) {
				retStr = "2";//"图片太大，最多只能为4M";
				e.printStackTrace();
			}catch (FileUploadException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return retStr;
	}
}
