package pack.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;

public class FDO {

	private static final String SAVEFOLDER = "D:\\Java_Web_AI\\silsp\\jsp\\p10_FileDown_Remove\\src\\main\\webapp\\fileStorage";

	// 다운로드 메서드 시작
	public void mtdDownload(HttpServletRequest req, HttpServletResponse res, JspWriter out, PageContext pageContext) {

		String fName = null;

		try {
			req.setCharacterEncoding("UTF-8");
			fName = req.getParameter("fName");

			File file = new File(SAVEFOLDER + File.separator + fName);

			byte[] b = new byte[(int) file.length()];

			// 자바의 속성이 아니라 브라우저의 속성(네트워크 단위)이기에
			// 이 소스를 복붙해야함.
			res.setHeader("Accept-Ranges", "bytes");
			req.getHeader("User-Agent");
			res.setContentType("application/smnet;charset=utf-8");
			res.setHeader("Content-Disposition",
					"attachment;fileName=" + new String(fName.getBytes("UTF-8"), "ISO-8859-1"));

			out.clear();
			out = pageContext.pushBody();

			if (file.isFile()) {
				BufferedInputStream fIn = new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream fOuts = new BufferedOutputStream(res.getOutputStream());
				int read = 0;
				while ((read = fIn.read(b)) != -1) {
					fOuts.write(b, 0, read);
				}
				fOuts.close();
				fIn.close();
			}

		} catch (IOException e) {
			System.out.println("파일 처리 이슈 : " + e.getMessage());
		}

	}

}