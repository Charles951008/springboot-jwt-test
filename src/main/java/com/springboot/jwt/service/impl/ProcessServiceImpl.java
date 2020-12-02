package com.springboot.jwt.service.impl;

import com.springboot.jwt.service.ProcessService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.runtime.ProcessInstance;

import java.util.Map;

/**
 * @author wangshengli
 */
public class ProcessServiceImpl implements ProcessService {

    private ProcessEngine processEngine;

    public ProcessEngine getProcessEngine() {
        return processEngine;
    }

    public void setProcessEngine(ProcessEngine processEngine) {
        this.processEngine = processEngine;
    }

    @Override
    public ProcessInstance startProcess(String key, Map<String, Object> map) {
        return processEngine.getRuntimeService().startProcessInstanceByKey(key,map);
    }
}
