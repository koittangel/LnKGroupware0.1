package com.lnk.service;

import java.io.File;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.lnk.exception.FileException;

@Service
public class FileServiceImpl implements FileService {
	
	private static final String UPLOAD_FORDER = "/upload";

	// 파일 추가
	@Override
	public String add(HttpServletRequest req, MultipartFile atm) throws FileException {
		try {
			// 최상위 경로 밑 upload폴더 경로 가져옴
			String path = req.getServletContext().getRealPath(UPLOAD_FORDER);
			
			// atm 객체를 이용해 파일을 서버에 전송
			if (atm != null && !atm.isEmpty()) {
				
				// MultiparFile 객체에서 파일명을 가져온다
				String original = atm.getOriginalFilename();
				
				// upload 폴더가 없다면, upload폴더 생성
				File directory = new File(path);
				if (!directory.exists()) {
					directory.mkdirs();
				}
				
				// 중복된 파일명을 피하기 위해 시간값을 파일명에 붙이기
				
				// 원래 파일명에서 확장자의 시작하는 부분을 찾음
				Integer idx = original.lastIndexOf(".");
				
				// 원래 파일명에서 확장자를 뺀 나머지 부분을 name변수에 저장
				String name = original.substring(0, idx);
				
				// 원래 파일명에서 파일 확장자 부분만 ext변수에 저장
				String ext = original.substring(idx, original.length());
				
				// 파일명 + 현재 시간값을 16진수로 변환한 값 + 확장자
				String uploadFilename = name + Long.toHexString(System.currentTimeMillis()) + ext;
				
				// transferTo 파라미터로 전달할 파일경로로 atm객체에 담겨있는 파일 내용 업로드
				atm.transferTo(new File(path, uploadFilename));
				
				// URL인코딩
				uploadFilename = URLEncoder.encode(uploadFilename, "UTF-8");
				
				/*	16진수 시간값이 포함된 파일명을 컨트롤러로 전달
				 * 	전달 후 컨트롤러에서 VO객체에 setAttachment메소드를 이용하여 
				 * 	파일명을 VO객체에 저장
				 */
				return uploadFilename;
			
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw new FileException(e.getMessage());
		}
		return null;
	}

    // 파일 삭제
	@Override
	public void remove(HttpServletRequest req, String filename) throws FileException {
		String path = req.getServletContext().getRealPath(UPLOAD_FORDER);
		if (filename != null && !filename.trim().isEmpty()) {
			// filename 디코딩
			try {
				filename = URLDecoder.decode(filename, "UTF-8");
			} catch (Exception e) {
				throw new FileException(e.getMessage());
			}
			
			// 서버에 저장된 파일을 불러와서 객체화
			File file = new File(path, filename);
			
			// 만약 파일이 존재한다면 파일 삭제
			if (file.exists()) {
				file.delete();
			}
			
		}
	}

	// 파일 저장 경로 + 파일명
	@Override
	public String getImgPath(HttpServletRequest req, String filename) {
		// Context경로 가져오기
		String contextPath = req.getContextPath();
		
		// 파일 확장자 추출
		if (filename != null && !filename.trim().isEmpty()) {
			int idx = filename.lastIndexOf(".");
			String ext = filename.substring(idx, filename.length());
			
			// 만약 아래 확장자 파일이면 파일 경로 리턴
			switch (ext) {
				case ".jpg":
				case ".png":
				case ".jpeg":	
					return contextPath + UPLOAD_FORDER + "/" + filename;
			}
		}
		// 그림 파일이 아니면 null값 리턴
		return null;
	}

	// 파일 저장 폴더 경로 가져오기
	@Override
	public String getUploadPath(HttpServletRequest req) {
		return req.getContextPath() + UPLOAD_FORDER;
	}

}
