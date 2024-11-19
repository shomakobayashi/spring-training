package com.ec.springtraining.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    /**従業員を一人取得*/
    public Employee getEmployee(String id) {
        Map<String, Object> map = helloRepository.findById(id);

        //MAPから値を取得
        String employeeId = (String)map.get("id");
        String name = (String)map.get("name");
        int age = (Integer)map.get("age");

        //Employeeクラスにセット
        Employee employee = new Employee();
        employee.setEmployeeId(employeeId);
        employee.setEmployeeName(name);
        employee.setEmployeeAge(age);

        return employee;
    }

}

