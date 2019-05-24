import static spark.Spark.*;
import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class App{
    public static void main(String[] args) {
        staticFileLocation("/public");
        port(4568);

        get("/", (request, response) -> {
            return new ModelAndView(new HashMap(), "/index.hbs");
        }, new HandlebarsTemplateEngine());
//
//        get("/favorite_photos", (request, response) ->{
//            return new ModelAndView(new HashMap(), "favorite_photos.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        get("/form", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            return new ModelAndView(model, "form.hbs");
//        }, new HandlebarsTemplateEngine());

        post("/posts/new", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<String, Object>();
            String department = request.queryParams("department");
            Division division = new Division("department", "section", 0, "staff", "role", "responsibilities");
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());

//        get("/form", (request, response) -> {
//            return new ModelAndView(new HashMap(), "success.hbs");
//        }, new HandlebarsTemplateEngine());
    }


//        get("/greeting_card", (request, response) -> {
//            Map<String, Object> model = new HashMap<String, Object>();
//            String id = request.queryParams("id");
//            String staff = request.queryParams("staff");
//            String division = request.queryParams("division");
//            String department = request.queryParams("department");
//            String section = request.queryParams("section");
//            String role = request.queryParams("role");
//            String responsibilities = request.queryParams("responsibilities");
//            model.put("id", id);
//            model.put("staff", staff);
//            model.put("division", division);
//            model.put("department", department);
//            model.put("section", section);
//            model.put("role", role);
//            model.put("responsibilities", responsibilities);
//            return new ModelAndView(model, "greeting_card.hbs");
//        }, new HandlebarsTemplateEngine());


}

































