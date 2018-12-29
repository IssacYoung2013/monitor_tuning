package com.issac.monitor_tuning.chapter2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 *
 * author:  ywy
 * date:    2018-12-24
 * desc:
 */
@RestController
public class MemoryController {

    private List<User> userList = new ArrayList<>();

    private List<Class<?>> classList = new ArrayList<>();

    /**
     *  -Xmx32M -Xms32M
     * @return
     */
    @GetMapping("/heap")
    public String heap() {
        int i = 0;
        while (true) {
            userList.add(new User(i++, UUID.randomUUID().toString()));
        }
    }

    /**
     * -XX:MetaspaceSize=32M -XX:MaxMetaspaceSize=32M
     * @return
     */
    @GetMapping("/nonheap")
    public String nonheap() {
        int i = 0;
        while (true) {
            classList.addAll(Metaspace.createClasses());
        }
    }
}
