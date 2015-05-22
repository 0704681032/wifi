package com.jyy.cmd;

import com.jyy.util.CpmDataPool;
import com.xunlei.netty.httpserver.cmd.CmdMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xunlei.netty.httpserver.cmd.BaseCmd;
import com.xunlei.netty.httpserver.component.XLHttpRequest;
import com.xunlei.netty.httpserver.component.XLHttpResponse;


@Service
public class AdminCmd extends BaseCmd {
	@Autowired
	private CpmDataPool cpmDataPool;

    @CmdMapper("/reload")
	public Object load(XLHttpRequest request, XLHttpResponse response) throws Exception {
        cpmDataPool.reload();
        return "success!";
	}

}
