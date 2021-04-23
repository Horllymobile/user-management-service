package com.horllymobile.microserviceusermanagement.service;

import com.horllymobile.microserviceusermanagement.model.User;

import java.util.List;

public interface UserService {

    User save(User user);

    List<String> findUsers(List<Long> idList);

    String findByUsername(String username);
}
