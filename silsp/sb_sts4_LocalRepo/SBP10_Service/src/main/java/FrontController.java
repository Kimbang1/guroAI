

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exam.basic.svc.SvcInface;

@Controller
public class FrontController {
	
	@Autowired
	private SvcInface svcInface;
	//메인페이지
	@RequestMapping("/")
	public @ResponseBody String root() {
		return"print ok!!";
	}
	
	//목록페이지
	@RequestMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("daoBoardList",svcInface.svcList());
		return"/bbs/list";
	}
}
