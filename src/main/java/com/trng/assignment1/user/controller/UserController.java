package com.trng.assignment1.user.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trng.assignment1.user.response.model.UserResponseModel;



@RestController
@RequestMapping("/user")
public class UserController {
	
	
	
	 @GetMapping(value="/{userId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	  public ResponseEntity<UserResponseModel> getUser(@PathVariable("userId") String userId) {
	       
		 	UserResponseModel returnValue=new UserResponseModel();
		 	returnValue.setName("John");
		 	returnValue.setEmail("john.doe@google.com");
		 	returnValue.setAge(23);
		         
	        return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	    }
		

}
