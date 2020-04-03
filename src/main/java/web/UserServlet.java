package web;
import model.RestaurantThing;
import org.slf4j.Logger;
import util.RestaurantThingUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

import static org.slf4j.LoggerFactory.getLogger;
public class UserServlet extends HttpServlet {
    private static final Logger log = getLogger(UserServlet.class);
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("getAll");
        request.setAttribute("things", RestaurantThingUtil.getThisDateRestThings(RestaurantThingUtil.RestaurantThing, LocalDate.now()));
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
