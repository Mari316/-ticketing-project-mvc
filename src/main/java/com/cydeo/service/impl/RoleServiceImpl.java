package com.cydeo.service.impl;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.CrudService;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


import java.util.List;

// class to class 'extends' add params to particular service<Role, Long> class to Interface 'implements'
// DO NOT forget to implement all methods
//@Component // make this class bean in order to use in DG
@Service //doing same as @Component but with more things
public class RoleServiceImpl extends AbstractMapService <RoleDTO, Long> implements RoleService {
    @Override
    public RoleDTO save(RoleDTO object) {
        return super.save(object.getId(), object); // we have this implementation in "AbstractMapService"
        //in order to call method from parent class to child class use "Super" keyword
    }

    @Override   //add list of obj
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id); // if no need to return anything just super.delete

    }

    @Override
    public RoleDTO findByID(Long id) { //Long - provide unique identifier
        return super.findByID(id);
    }

    @Override
    public RoleDTO myLogic(RoleDTO role, String str) {
        return null;
    }
}
