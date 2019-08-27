package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	  
       User getUser(Integer id);
       void addscore(Integer id,Integer score);
}
