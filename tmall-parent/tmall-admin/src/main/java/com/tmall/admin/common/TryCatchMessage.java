package com.tmall.admin.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


/**
 * 
 * <p>title:处理返回json时捕捉的异常信息</p>
 * <p>description:</p>
 * @author 甘新革
 * @date 2016年5月22日 下午11:20:30
 */
public final class TryCatchMessage {

    private final static Logger logger = Logger.getLogger(TryCatchMessage.class);

    /**
     * 查询返回json数据时捕捉异常
     * 
     * @param response
     *            响应
     * @param dataMap
     *            封装返回数据
     */
    public static void tryCatchSearch(HttpServletResponse response,Object object) {
        ObjectMapper mapper = new ObjectMapper();
        // 设置响应头为json类型，跨域
        response.setContentType("application/json;charset=UTF-8");
        try {
        	Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> objectMap = new HashMap<String, Object>();
			map.put("rows", object);
		    objectMap.put("data", map);
            mapper.writeValue(response.getWriter(), objectMap);
        }
        catch (JsonGenerationException e) {
        	logger.error("JsonGenerationException:"+e);
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
        	logger.error("JsonMappingException:"+e);
            e.printStackTrace();
        }
        catch (IOException e) {
        	logger.error("IOException:"+e);
            e.printStackTrace();
        }

    }

    /**
     * 保存返回json数据时捕捉异常
     * 
     * @param response
     *            响应
     * @param dataMap
     *            封装返回数据
     */
    public static void tryCatchSave(HttpServletResponse response, Map<String, Object> dataMap) {
        ObjectMapper mapper = new ObjectMapper();
        // 设置响应头为json类型，跨域
        response.setContentType("application/json;charset=UTF-8");
        try {
            mapper.writeValue(response.getWriter(), dataMap);
        }
        catch (JsonGenerationException e) {
            e.printStackTrace();
        }
        catch (JsonMappingException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
