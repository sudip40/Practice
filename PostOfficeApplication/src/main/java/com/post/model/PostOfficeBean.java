package com.post.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostOfficeBean {
	@JsonProperty("Message")
	private String message;
	
	@JsonProperty("Status")
	private String status;
	
	@JsonProperty("PostOffice")
	private List<PostOfficeDetails> postOffice;
}