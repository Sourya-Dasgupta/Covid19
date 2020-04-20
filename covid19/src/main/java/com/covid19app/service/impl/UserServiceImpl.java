package com.covid19app.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19app.UserRepository;
import com.covid19app.dto.UserDto;
import com.covid19app.entity.UserEntity;
import com.covid19app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDto createUser(UserDto user) {
		

		if(userRepository.findByEmail(user.getEmail())!= null) throw new RuntimeException("Record already exists");
		if(userRepository.findByPhoneNumber(user.getPhoneNumber())!=null) throw new RuntimeException("Phone number already exists");
		
		UserEntity userEntity= new UserEntity();
		BeanUtils.copyProperties(user, userEntity);
		
		userEntity.setEncryptedPassword("test");
		userEntity.setUserId("testUserId");
		
		
		
		UserEntity storedUserDetails = userRepository.save(userEntity);
		
		UserDto returnValue = new UserDto();
		BeanUtils.copyProperties(storedUserDetails, returnValue);
		
		return returnValue;
	}

	@Override
	public List<UserEntity> getPatientByLocation() {
		//UserEntity user = new UserEntity();
		
		return null;
	}

	@Override
	public List<UserEntity> getLocationByPatient() {
		// TODO Auto-generated method stub
		return null;
	}

}
