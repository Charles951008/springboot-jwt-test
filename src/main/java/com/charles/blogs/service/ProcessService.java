package com.charles.blogs.service;

import org.activiti.engine.runtime.ProcessInstance;

import java.util.Map;

public interface ProcessService {
    ProcessInstance startProcess(String key, Map<String, Object> map);
}
