package com.cydeo.service; // All business logic goes to service classes and it is abstract

import java.util.List;
                            // PASS CLASS TYPE!!!
public interface CrudService<T, ID> { // need to pass T and unique identifier JAVA  GENERICS
    // Here all actions from UI and any Service can use it
    // because we have repeated steps in both services (Role and USer), we are using generics T-any object can be

    T save(T object); // accepting obj, returning obj (T obj because we dont know exactly what obj)
    List<T> findAll(); // just returns list of obj
    T findByID(ID id); // returning Obj

    void deleteById(ID id); // delete based on ID

}
