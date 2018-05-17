package com.lnk.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

import com.lnk.exception.FileException;

public interface FileService {

	// 파일 추가
	public String add(HttpServletRequest req, MultipartFile atm) throws FileException;
	
	// 파일 다운로드
	//public void download(HttpServletRequest req, HttpServletResponse resp, String filename) throws FileException;
	
	// 파일 삭제
	public void remove(HttpServletRequest req, String filename) throws FileException;
	
	// 파일 저장 경로 + 파일명
	public String getImgPath(HttpServletRequest req, String filename);
	
	// 파일 저장 폴더 경로 가져오기
	public String getUploadPath(HttpServletRequest req);
}
