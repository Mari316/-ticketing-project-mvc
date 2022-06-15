package com.cydeo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
               // Using Generics always define them on the class level
public abstract class AbstractMapService <T, ID>{  //I dont want to create obj from this  - abstract
    // why not Interface  - I will define methods, implementation here

    // key (DB generates this) value (any obj)
    protected Map<ID, T> map = new HashMap<>();// -> we using this like DB for now

    // created empty map and put inside id and obj (User or role)
     T save (ID id, T object){
         map.put(id, object);
         return object;
     }
     //getting all from map as list
     List<T> findAll(){
         return new ArrayList<>(map.values());

     }
      T findByID(ID id){
         return map.get(id);
      }

      void deleteById(ID id){
         map.remove(id);

                   }


}
