package com.jyy;

import com.jyy.util.CpmDataPool;
import com.xunlei.jdbc.JdbcTemplate;
import com.xunlei.netty.httpserver.Bootstrap;
import com.xunlei.spring.BeanUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Launch {

	@Autowired
	private JdbcTemplate jdbcTemplate;

    @Autowired
    private CpmDataPool cpmDataPool;

	private void init() {
        cpmDataPool.init();
	}

	public static void main(String[] args) throws IOException {
		Bootstrap.main(args, new Runnable() {
		 	@Override
			public void run() {
				Launch launch = BeanUtil.getTypedBean(Bootstrap.CONTEXT, "launch");
				launch.init();
			}
		}, "classpath:applicationContext.xml");
	}
}
