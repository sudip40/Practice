package com.post.service;

import com.post.exceptions.CityException;
import com.post.model.PostOfficeBean;

public interface PostOfficeService {
	public PostOfficeBean fetchPostalDetailsByCityName(String name) throws CityException;
}
