package web;

import model.RestaurantThing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.RestaurantThingUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class AddingServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(AddingServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //  request.setCharacterEncoding("UTF-8");

        RestaurantThing thing = new RestaurantThing(
                request.getParameter("restaurantName"),
                request.getParameter("dishName"),
                Float.parseFloat(request.getParameter("dishPrice")),
                LocalDate.now());

        log.info("! ! !");
        RestaurantThingUtil.restaurantThings.add(thing);
        response.sendRedirect("voting");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/adding.jsp").forward(request, response);
    }
}
