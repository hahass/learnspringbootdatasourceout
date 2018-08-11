package com.hs.learnspringbootdatasourcerout.aop;

import com.hs.learnspringbootdatasourcerout.common.DataSources;
import lombok.extern.slf4j.Slf4j;

/**
 * 使用ThreadLocal安全的管理当前进程使用的数据源连接
 * 动态调整DataSourceContextHolder里存储的值，使用threadLocal来管理是为了避免多线程之间互相影响。
 */
@Slf4j
public class DataSourceContextHolder {
    /**
     * 默认数据源
     */
    public static final String DEFAULT_DATASOURCE = DataSources.MASTER_DB;
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    /**
     * 设置数据源名
     * @param dbType
     */
    public static void setDB(String dbType) {
        log.info("切换到{}数据源",dbType);
        contextHolder.set(dbType);
    }

    /**
     * 获取数据源名
     * @return
     */
    public static String getDB(){
        return contextHolder.get();
    }

    /**
     * 清除数据源名
     */
    public static void clearDB(){
        contextHolder.remove();
    }

}





























