package com.project.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.project.bean.BookBean;

public class FileUpload {
	private String name;
	private File fileImage;
	private String fileImageContentType;
	private String fileImageFileName;

	public File getFileImage() {
		return fileImage;
	}

	public void setFileImage(File fileImage) {
		this.fileImage = fileImage;
	}

	public String getFileImageContentType() {
		return fileImageContentType;
	}

	public void setFileImageContentType(String fileImageContentType) {
		this.fileImageContentType = fileImageContentType;
	}

	public String getFileImageFileName() {
		return fileImageFileName;
	}

	public void setFileImageFileName(String fileImageFileName) {
		this.fileImageFileName = fileImageFileName;
	}
	// 构造器

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 上传
	public void upload(BookBean bean) {
		ServletContext context = ServletActionContext.getServletContext();
		
		String path = context.getRealPath("/upload");
		
		System.out.println("path:" + path);
		
		File file = new File(path);
		if (!file.exists()) {
			file.mkdirs();
		}
		
	
		String newName = changeFileName(getFileImageFileName());
		this.setName("../upload/"+newName);
		System.out.println(getName());
		
		try {
			FileUtils.copyFile(fileImage, new File(file, newName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 新名字
	public String changeFileName(String fileName) {
		String newName = UUID.randomUUID() + fileName;
		return newName;
	}

}
