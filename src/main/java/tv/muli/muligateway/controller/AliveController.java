package tv.muli.muligateway.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jory
 * @date 2019-03-20
 */
@Slf4j
@RestController
public class AliveController {

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "muli-gateway alive!";
    }

    @RequestMapping(value = "/alive", method = RequestMethod.GET)
    public String alive() {
        return "alive!";
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public String name() {
        return environment.getProperty("spring.application.name") + ":" + environment.getProperty("spring.profiles.active");
    }

    @RequestMapping("/env")
    public String env() {
        return environment.getProperty("desc", "desc default");
    }
}
