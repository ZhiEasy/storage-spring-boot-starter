package com.github.zouchanglin.storage.utils;

import com.github.zouchanglin.storage.config.QiNiuProperties;
import com.qiniu.storage.Region;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * 机房选择器
 * @author zouchanglin
 * @date 2020/6/4
 */
@Configuration
@EnableConfigurationProperties(QiNiuProperties.class)
public class RegionSelector {
    @Resource
    private QiNiuProperties qiNiuProperties;

    public Region selectRegion(){
        String region = qiNiuProperties.getRegion();
        switch (region){
            case "huadong":
                return Region.huadong();
            case "huabei":
                return Region.huabei();
            case "huanan":
                return Region.huanan();
            case "xinjiapo":
                return Region.xinjiapo();
            case "beimei":
                return Region.beimei();
            default:
                return Region.autoRegion();
        }
    }
}
