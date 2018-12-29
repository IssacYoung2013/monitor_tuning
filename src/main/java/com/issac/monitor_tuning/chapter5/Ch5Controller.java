package com.issac.monitor_tuning.chapter5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * author:  ywy
 * date:    2018-12-27
 * desc:
 */
@RestController
@RequestMapping("/ch5")
public class Ch5Controller {

    @RequestMapping("/hello")
    public String hello() {
       String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }

        return str;
    }
}
