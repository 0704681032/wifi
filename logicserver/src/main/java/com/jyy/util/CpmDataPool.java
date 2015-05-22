package com.jyy.util;

import com.jyy.JsonUtil;
import com.xunlei.jdbc.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by jyy on 5/22/15 5:51 PM.
 */
@Component
public class CpmDataPool {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static final String NOUPDATE_TEMPLATECONTENT;//不需要更新的时候返回的模板内容

    private  String templateContent;//需要更新的时候返回的模板内容

    private  String latestVersion = "";//配置文件的最新版本号

    private Lock lock = new ReentrantLock();

    static {
        NOUPDATE_TEMPLATECONTENT = JsonUtil.getTemplateNoUpdateJson();
    }

    public  void init() {
        try {
            lock.lock();
            String content = JsonUtil.generateTemplateJson(jdbcTemplate);
            String ver = "675";//TODO 计算版本号的逻辑
            templateContent = content;
            latestVersion = ver;
        } finally {
            lock.unlock();
        }
    }


    public void reload() {
        try {
            lock.lock();
            String content = JsonUtil.generateTemplateJson(jdbcTemplate);
            String ver = "675";//TODO 计算版本号的逻辑
            templateContent = content;
            latestVersion = ver;
        } finally {
            lock.unlock();
        }
    }

    public String getLatestVersion() {
        return latestVersion;
    }

    public String getTemplateContent() {
        return templateContent;
    }

}
