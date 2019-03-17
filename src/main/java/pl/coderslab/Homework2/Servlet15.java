package pl.coderslab.Homework2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            numbers.add(random.nextInt(100)+1);
        }

        response.getWriter().println(numbers);
        Collections.sort(numbers);
        response.getWriter().println(numbers);

    }
}
