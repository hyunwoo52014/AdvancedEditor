package com.github.hyunwoo52014.project.service;

import org.springframework.stereotype.Service;

@Service
public class DataService {
	public String getSpringData() {
		return "스프링 컨테이너에서 가져온 데이터입니다.";
	}
}
