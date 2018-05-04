package pl.springbootpractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.springbootpractice.entity.Topic;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {

        return Arrays.asList(

                new Topic("spring", "Spring Framework", "Spring Frmework Desc"),
                new Topic("spring", "Spring Framework", "Spring Frmework Desc")
        );
    }
}
