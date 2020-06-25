package com.spring.basic.repository;

import com.spring.basic.model.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dhokim on 2020-06-25
 */
public interface UserMapper extends CrudRepository<User, Integer> {

}
