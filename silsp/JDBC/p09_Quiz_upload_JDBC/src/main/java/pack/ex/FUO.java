package pack.ex;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import pack.jdbc.DBConn;

public class FUO {

	public boolean mtdupload(HttpServletRequest req) {
		
		boolean chk = false;
		
		
		String saveFolder = "E:\\java_Web_AI\\silsp\\jsp\\p09_Quiz_upload_JDBC\\src\\main\\webapp\\fileStorage";
		int maxSize = 5*1024*1024; //5Mbyte단위 까지 최대 업로드 허용
		String encType = "UTF-8";

		String subject="";
		String content="";


		String originalFile ="";	//원본 파일명
		String uploadFile ="";		//업로드된 파일명
		String detail = "";			//파일에 대한 설명(내용)

		int fileSize = 0;			//파일 크기(=용량)

		try{
			
		MultipartRequest multiReq = new MultipartRequest(
					req,
					saveFolder,
					maxSize,
					encType,
					new DefaultFileRenamePolicy()
				);

			//폼데이터 처리
			subject = multiReq.getParameter("subject");
			content = multiReq.getParameter("content");

			//파일 정보 처리
			
			originalFile = multiReq.getOriginalFileName("fileName");
			//원본 파일명
			
			uploadFile = multiReq.getFilesystemName("fileName");
			//업로드 후 저장된 파일명
			
			//업로드된 파일에 대한 설명 (예시: content)
			detail = content;
			
			
			
			//DBConn 클래스의 insertFileEleent 메서드 호출
			DBConn dbconn = new DBConn();
			dbconn.insertFileEleent(multiReq);
			
		
			chk=true;
		}catch(IOException e){
			System.out.print(e.getMessage());
		}
		return chk;
	}
}
