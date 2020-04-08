package web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.RestaurantThingUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

public class VotingServlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(VotingServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        log.info("getAll");
        request.setAttribute("things", RestaurantThingUtil.getThisDateRestThings(RestaurantThingUtil.RestaurantThing, LocalDate.now()));
        request.getRequestDispatcher("/voting.jsp").forward(request, response);
    }
}
