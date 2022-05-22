package lab11.streamsschedule.controller;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;
@RestController
@RequestMapping()
public class LiveStreamController {
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @Controller
    @ResponseBody
    public @interface RestController {
        @AliasFor(annotation = Controller.class)
        String value() default "";
    }
}
