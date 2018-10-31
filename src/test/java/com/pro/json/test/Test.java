package com.pro.json.test;


import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

public class Test {

    public static void main(String[] args) {
        String jsonStr = "{\"name\": \"xiaoming\", \"age\": 16}";
        JSONObject json = JSONObject.parseObject(jsonStr);
        System.out.println(json);

        String[] array = new String[] {"a", "b", "c", "d"};
        System.out.println(StringUtils.join(array, "||"));
    }
}
