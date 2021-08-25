package com.human.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//새 컨트롤러 만들고(.java), Model 이용해서 전화번호 전달 -> contactus.jsp
//JSP파일에는 myCompany <- Title
//저희회사 연락처는 ...입니다
@Controller
public class MyController {
//	@RequestMapping(value="/contactus", method=RequestMethod.GET)
//	public String method1(Model model) { // Model class 이용
//		model.addAttribute("mobile", "01012314213");
//		
//		return "contactus";
//	}
	
	@RequestMapping(value="/contactus")
	public ModelAndView method() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("mobile", "01012314214");
		mav.setViewName("contactus");
		
		return mav;
	}
}

