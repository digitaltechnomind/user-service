package com.trng.assignment1.user.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trng.assignment1.user.data.UserEntity;
import com.trng.assignment1.user.response.model.UserResponseModel;
import com.trng.assignment1.user.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService usersvc;
	
	 @GetMapping(value="/{userId}", produces = { MediaType.APPLICATION_JSON_VALUE })
	  public ResponseEntity<UserResponseModel> getUser(@PathVariable("userId") String userId) {
	       
		 UserEntity user=null;
		 UserResponseModel returnValue=new UserResponseModel();
		 try {
		    Long id=Long.parseLong(userId) ;
		    user=usersvc.getUserById(id);
		    if(user!=null) {
		    returnValue.setName(user.getName());
		 	returnValue.setEmail(user.getEmail());
		 	returnValue.setAge(user.getAge());
		    }else {
		    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(returnValue);
		    }
		 }catch(NumberFormatException ex) {
			 
			 return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(returnValue);
		 }
		 	
		 	
		 return ResponseEntity.status(HttpStatus.OK).body(returnValue);
	    }
		

}
