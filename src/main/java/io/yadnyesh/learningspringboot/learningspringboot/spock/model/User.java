package io.yadnyesh.learningspringboot.learningspringboot.spock.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class User {
	
	private Long id;
	
	private String name;
	
}
