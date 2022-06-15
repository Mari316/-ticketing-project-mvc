package com.cydeo.converter;

import com.cydeo.dto.RoleDTO;
import com.cydeo.service.RoleService;
import org.springframework.beans.TypeConverterSupport;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding //Spring looking for obj to convert. When we use TL we need converter, with Angular it is different
//html is returning us String but we are looking for obj Converter Interface helps us,  <Source, Target>
public class RoleDtoConverter implements Converter<String, RoleDTO> {
   // Inject obj, generate constructor
RoleService roleService;

    public RoleDtoConverter(RoleService roleService) {
        this.roleService = roleService;
    }

    @Override
    public RoleDTO convert(String source) {
        //we need to find and return obj here, all obj in the map

        return roleService.findByID(Long.parseLong(source));// source coming from html and converting to obj
    }
}
