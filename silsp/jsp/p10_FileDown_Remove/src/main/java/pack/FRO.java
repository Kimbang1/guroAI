package pack;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

public class FRO {

	private static final String SAVEFOLDER = "D:\\Java_Web_AI\\silsp\\jsp\\p10_FileDown_Remove\\src\\main\\webapp\\fileStorage";
	
	//파일 삭제 시작
	public boolean mtdFiledRemove(HttpServletRequest req){
		boolean remChk =false;
		
		try {
			req.setCharacterEncoding("UTF-8");
			String fName = SAVEFOLDER + "/" + req.getParameter("fName");
			
			File objFile = new File(fName);
			
			if(objFile.exists())
				remChk = objFile.delete();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return remChk;
	}
}
