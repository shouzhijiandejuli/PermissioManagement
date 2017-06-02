package com.gcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gcl.common.annotation.Authority;
import com.gcl.common.annotation.ControllerLog;
import com.gcl.common.pojo.PageAjax;
import com.gcl.model.ILog;
import com.gcl.service.LogService;

@Controller
@RequestMapping("/admin/log/")
public class LogController extends BaseController {

	@Autowired
	private LogService logService;

	@Authority(opCode = "0301", opName = "日志管理界面")
	@RequestMapping("mainPage")
	public String mainPage(){
		return "log/main";
	}

	@ControllerLog("查询日志列表")
    @RequestMapping("queryPage")
    @ResponseBody
    @Authority(opCode = "0301", opName = "查询日志列表")
    public PageAjax<ILog> queryPage(PageAjax<ILog> page, ILog log) {
        return logService.queryPage(page, log);
    }
}
