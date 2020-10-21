package com.miaosha.agent.config;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author lr-qixin
 * @date 2020-10-15
 */
@Component
public class AlipayProperties {
    public static final String APP_ID = "appId";
    public static final String PRIVARY_KEY = "privateKey";
    public static final String PUBLIC_KEY = "publicKey";
    public static final String NOTIFY_URL = "notifyUrl";
    public static final String RETURN_URL = "returnUrl";
    public static final String SIGN_TYPE = "signType";
    public static final String CHARSET = "charset";
    public static final String GATEWAY_URL = "gatewayUrl";
    public static final String LOG_PATH = "logPath";

    /**
     * 保存加载配置参数
     */
    private static Map<String, String> propertiesMap = new HashMap<String, String>();

    public static void loadproperties() {
        // 获得PathMatchingResourcePatternResolver对象
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            // 加载resource文件(也可以加载resources)
            Resource resource = resolver.getResource("classpath:alipay.properties");
            PropertiesFactoryBean config = new PropertiesFactoryBean();
            config.setLocation(resource);
            config.afterPropertiesSet();
            Properties pro = config.getObject();
            for (String key : pro.stringPropertyNames()) {
                propertiesMap.put(key, (String) pro.get(key));
            }
        } catch (Exception e) {
            new Exception(e + "配置文件加载失败！");
        }
    }

    /**
     * 获取配置参数值
     * @param key
     * @return
     */
    public static String getKey(String key) {
        return propertiesMap.get(key);
    }

    public static String getAppId() {
        return propertiesMap.get(APP_ID);
    }

    public static String getPrivateKey() {
        return propertiesMap.get(PRIVARY_KEY);
    }

    public static String getPublicKey() {
        return propertiesMap.get(PUBLIC_KEY);
    }

    public static String getNotifyUrl() {
        return propertiesMap.get(NOTIFY_URL);
    }

    public static String getReturnUrl() {
        return propertiesMap.get(RETURN_URL);
    }

    public static String getSignType() {
        return propertiesMap.get(SIGN_TYPE);
    }

    public static String getCharset() {
        return propertiesMap.get(CHARSET);
    }

    public static String getGatewayUrl() {
        return propertiesMap.get(GATEWAY_URL);
    }

    public static String getLogPath() {
        return propertiesMap.get(LOG_PATH);
    }
}
