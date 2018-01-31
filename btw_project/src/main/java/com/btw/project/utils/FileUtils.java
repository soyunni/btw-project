package com.btw.project.utils;

import java.io.File;

/**
 * <pre>
 * 클래스명 : hanmi.hmp.share.utils.FileUtils.java
 * 기능요약 : 파일 처리 지원 유틸리티 (JSTL에서 사용)
 * 생성일 : 2015. 7. 24.
 * </pre>
 */
public class FileUtils {

	/**
	 * <pre>
	 * 함수명 : fileExists
	 * 기능설명 : 요청된 경로에 실제 파일이 있는지 검증한다.
	 * 생성일(수정일) : 2018. 01. 31.
	 * 생성자(수정자) : sypark
	 * </pre>
	 * @param fileName 파일경로
	 * @return 파일존재여부
	 */
	public static boolean fileExists(String fileName){
		File f = new File(fileName);
		return f.exists();
	}

	/**
	 * <pre>
	 * 함수명 : getOriginalFileName
	 * 기능설명 : 원본 파일명을 조회한다 (IE에서는 파일명 뿐만아니라 경로도 따라 옴)
	 * 생성일(수정일) : 2018. 01. 31.
	 * 생성자(수정자) : sypark
	 * </pre>
	 * @param originalFilename 원본파일명
	 * @return 원본파일명
	 */
	public static String getOriginalFileName(String originalFilename){
		if( originalFilename != null && !originalFilename.equals("") && originalFilename.length() > 0){
			String originalFilenameArray[] = originalFilename.split("\\\\");
			originalFilename = originalFilenameArray[originalFilenameArray.length-1];
		}
		return originalFilename;
	}

}
