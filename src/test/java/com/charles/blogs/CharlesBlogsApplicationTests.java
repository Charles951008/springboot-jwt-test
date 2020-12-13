package com.charles.blogs;

import com.charles.blogs.service.ProcessService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class CharlesBlogsApplicationTests {

    @Autowired
    private ProcessEngine processEngine;
    @Autowired
    private ProcessService processService;

    @Test
    void contextLoads() {
    }

    @Test
    public void startProcess(){
        RuntimeService runtimeService = this.processEngine.getRuntimeService();
        String processDefinitionKey="financeProcess";
        runtimeService.startProcessInstanceByKey(processDefinitionKey);
        System.out.println("流程启动成功");
    }

    @Test
    public ProcessInstance startTask(){
        return processService.startProcess("financeProcess",null);
    }

}
