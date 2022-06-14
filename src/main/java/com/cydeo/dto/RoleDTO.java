package com.cydeo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleDTO { // why do we have this DTO? Data transfer obj - interacting only with UI communicate to DB with Mappers

    private Long id;
    private String description;
}
