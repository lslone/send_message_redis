package com.wljs.utill;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;
import java.util.Map;

/**
 *
 * @Description: 基于fastjson封装的json转换工具类
 * @author lsl
 * @date 2019年10月15日
 *
 */
public class FastJsonUtils {

    /**
     * @Description: 把JSON数据转换成指定的java对象
     * @Param: [jsonData, clazz]
     * @return: T 指定的java对象
     * @Author: lsl
     * @Date: 2019/10/15
     */
    public static <T> T getJsonToBean(String jsonData, Class<T> clazz) {
        return JSON.parseObject(jsonData, clazz);
    }


    /**
     * @Description: 把java对象转换成JSON数据
     * @Param: [object]
     * @return: java.lang.String JSON数据
     * @Author: lsl
     * @Date: 2019/10/15
     */
    public static String getBeanToJson(Object object) {

        return JSON.toJSONString(object);
    }


    /**
     * @Description:把JSON数据转换成指定的java对象列表
     * @Param: [jsonData, clazz]
     * @return: java.util.List<T>
     * @Author: lsl
     * @Date: 2019/10/15
     */
    public static <T> List<T> getJsonToList(String jsonData, Class<T> clazz) {

        return JSON.parseArray(jsonData, clazz);
    }


    /**
     * @Description:把JSON数据转换成较为复杂的List<Map<String, Object>>
     * @Param: [jsonData]
     * @return: java.util.List<Map<String,Object>>
     * @Author: lsl
     * @Date: 2019/10/15
     */
    public static List<Map<String, Object>> getJsonToListMap(String jsonData) {

        return JSON.parseObject(jsonData, new TypeReference<List<Map<String, Object>>>() {
        });
    }


}
