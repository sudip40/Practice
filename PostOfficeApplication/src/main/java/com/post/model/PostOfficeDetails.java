package com.post.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PostOfficeDetails {
	@JsonProperty("Name")
	private String name;
	
	@JsonProperty("Description")
	private String Description;
	
	@JsonProperty("BranchType")
	private String BranchType;
	
	@JsonProperty("DeliveryStatus")
	private String DeliveryStatus;
	
	@JsonProperty("Circle")
	private String Circle;
	
	@JsonProperty("District")
	private String District;
	
	@JsonProperty("Division")
	private String Division;
	
	@JsonProperty("Region")
	private String Region;
	
	@JsonProperty("State")
	private String State;
	
	@JsonProperty("Country")
	private String Country;
	
	@JsonProperty("Pincode")
	private String Pincode;
}
