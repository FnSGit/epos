package com.fsyj.epos.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "test")

public class ConfigurationYaml {
    private String workTask;
    private long startLong;

    public String getWorkTask() {
        return workTask;
    }

    public void setWorkTask(String workTask) {
        this.workTask = workTask;
    }

    public long getStartLong() {
        return startLong;
    }

    public void setStartLong(long startLong) {
        this.startLong = startLong;
    }

    @Override
    public String toString() {
        return "ConfigurationYaml{" +
                "workTask='" + workTask + '\'' +
                ", startLong=" + startLong +
                '}';
    }
}
