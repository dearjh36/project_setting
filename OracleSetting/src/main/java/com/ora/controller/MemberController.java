package com.ora.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.won.VO.MemberVO;
import com.won.service.MemberService;

@Controller
@RequestMapping(value = "/member")
public class MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberservice;
	
	// ?��?���??��(join) ?��?���? ?��?��
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void joinGET() {
		logger.info("?��?���??�� ?��?���? 진입");	
	}
	
	// ?��?���??��
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String joinGET(MemberVO member) throws Exception {
		logger.info("join 진입");	
		
		memberservice.memberJoin(member);
		
		logger.info("join Service ?���?");
		
		return "redirect:/main";
	}
	
	// 로그?�� ?��?���? ?��?��
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET() {
		logger.info("로그?�� ?��?���? 진입");
	}
}
