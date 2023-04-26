package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/signup")
	public String signup() {
		return "member/register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "member/login";
	}
}