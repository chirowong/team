package com.qatang.team.data.controller.test;

import com.qatang.team.data.service.test.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangzhiliang
 */
@RestController
@RequestMapping("/service")
public class TestServiceController {

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
