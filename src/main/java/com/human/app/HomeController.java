package com.human.app;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("myName", "Seo Jung Eui");
		//집주소, 모바일번호
		model.addAttribute("myAddr", "천안 두정동");
		model.addAttribute("myMobile", "01012341234");
		return "home";
	}
	@RequestMapping(value="/a", method=RequestMethod.GET)
	public String home1(Locale locale, Model m) {
		m.addAttribute("m_name", "abc");
		
		return "test";
	}
	
	@RequestMapping(value="/info", method=RequestMethod.GET)
//	public String doInfo(HttpServletRequest hsr, Model model) {
//		String uid=hsr.getParameter("userid");
//		String addr=hsr.getParameter("address");
//		String n=hsr.getParameter("income");
//		int salary = Integer.parseInt(n)
//		model.addAttribute("loginid", uid);
//		model.addAttribute("region", addr);
//		model.addAttribute("salary", salary);
//		//userid -> uid -> loginid, adress -> addr -> region
//		return "viewinfo";
//	public String doInfo(Model model, @RequestParam("userid") String uid, @RequestParam("address") String addr) {
//		model.addAttribute("loginid", uid);
//		model.addAttribute("region", addr);
//		return "viewinfo";
		
	public String doInfo(Model model, ParamList pl) {
		model.addAttribute("loginid", pl.userid);
		model.addAttribute("region", pl.address);
		return "viewinfo";
	}

	@RequestMapping(value="/getinfo", method=RequestMethod.GET)
	public String getInfo() {
				
		return "getinfo";
	}
	
	@RequestMapping(value="/viewinfo")
	public String viewInfo() {
		
		return "viewinfo";
	}
	
	@RequestMapping(value="/choose")
	public String doChoose() {
		return "choose";
	}
	
	@RequestMapping(value="/selected")
	public String doJob(HttpServletRequest hsr, Model model) {
		String strPath=hsr.getParameter("path");
		if(strPath.equals("login")){
			return "getinfo";
		} else if(strPath.equals("newbie")) {
			return "newbi";
		} else {
			return "choose";
		}
	}
	@RequestMapping("/today/{address}/{userid}")
	public String showNumber(@PathVariable String userid, @PathVariable String address, Model model) {
		model.addAttribute("addr", address);
		model.addAttribute("uid", userid);
		return "today";
	}
}