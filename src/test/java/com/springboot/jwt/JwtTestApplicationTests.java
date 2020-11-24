package com.springboot.jwt;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JwtTestApplicationTests {

    @Autowired
    private ProcessEngine processEngine;
    @Test
    void contextLoads() {
    }
    @Test
    public void startProcess(){
        RuntimeService runtimeService = this.processEngine.getRuntimeService();
        String processDefinitionKey="Apply";
        runtimeService.startProcessInstanceByKey(processDefinitionKey);
        System.out.println("流程启动成功");
    }

}
