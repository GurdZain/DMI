package com.models.cloud.web.controller.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.models.cloud.gw.protocolfactory.impl.SearchPayOrderInterfaceImpl;
import com.models.cloud.util.hint.Hint;
import com.models.cloud.web.controller.DoWebPageService;

/**
 * 查询交易单，返回交易结果
 * @Description
 * @encoding UTF-8 
 * @author haiyan.zhang
 * @date 2016年5月22日 
 * @time 下午2:00:12
 * @version V1.0
 * @修改记录
 *
 */
@Service("toCardAjaxServiceImpl")
public class ToCardAjaxServiceImpl implements DoWebPageService {
	private Logger logger = Logger.getLogger(ToCardAjaxServiceImpl.class);
	
	@Override
	public Map<String, Object> returnData(Map<String, Object> map, Model model, HttpServletRequest request) {
		return null;
	}

	@Override
	public Map<String, Object> returnDataByMap(Map<String, Object> map, HttpServletRequest request) {
		if(logger.isInfoEnabled()){
			logger.info("添加新卡，先请求ajax再跳转页面 ");
		}
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("resultCode", Hint.SYS_SUCCESS.getCodeString());
    	resultMap.put("resultDesc", Hint.SYS_SUCCESS.getMessage());
		return resultMap;
	}

}
