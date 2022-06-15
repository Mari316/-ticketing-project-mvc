package com.cydeo.service;

import com.cydeo.dto.UserDTO;

import java.util.List;
                            // why String and not ID? because UserDTO (T obj) and ID means String
public interface UserService extends CrudService<UserDTO, String> {



}
