package com.story.UserStorytask;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserStoryController {
	@PostMapping("/cdv")
	public @ResponseBody ResponseEntity<CDVDetails> getAllProducts(@RequestBody CDVRouteEvent request){

		CDVDetails cdv=getDetails();
		

		ResponseEntity<CDVDetails> cdvr=new ResponseEntity<>(cdv,HttpStatus.OK);
		
		return cdvr;
	}
public CDVDetails getDetails() {
	CDVDetails cdv=new CDVDetails();
	cdv.setID("HELLO");
	cdv.setName("RAMESH");
	return cdv;
}
}
