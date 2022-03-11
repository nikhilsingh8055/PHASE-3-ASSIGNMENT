package com.simplilearn;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

	@GetMapping("/")
	public User getUsers()
	{
		
		//Here we have used RestTemplate to use Fake Api link untill we work on frontend...
		RestTemplate template= new RestTemplate();
		User user= template.getForObject("https://jsonplaceholder.typicode.com/users/2", User.class);
		
		return user;

}
}