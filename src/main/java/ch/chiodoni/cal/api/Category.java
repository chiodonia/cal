package ch.chiodoni.cal.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Category {
    public final static Logger LOGGER = LoggerFactory.getLogger(ch.chiodoni.cal.api.Category.class);

    @GetMapping("/categories")
    @ResponseBody
    public List<CategoryModel> categories() {
        LOGGER.info("categories called");
        return List.of(
                new CategoryModel("foo"),
                new CategoryModel("bar")
        );
    }

    private record CategoryModel(String name) {
    }
}
