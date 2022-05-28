package com.cydeo.service;

import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;

import java.util.List;

public interface RoleService extends CrudService <RoleDTO, Long> {
    // need to think what I do with roles: save, delete, update, findAll -business logic, made it abstract
    // here all we wanna do with role, change it any time mostly CRUD

    RoleDTO myLogic (RoleDTO role, String str); // can add any custom method


}
