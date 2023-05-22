import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

public class CalculatorController extends HttpServlet {
    private static final long serialVersionUID = 1L;
	private CalculatorModel calculatorModel = new CalculatorModel();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double dividend = Double.parseDouble(request.getParameter("dividend"));
        double divisor = Double.parseDouble(request.getParameter("divisor"));

        try {
            double result = calculatorModel.divide(dividend, divisor);
            request.setAttribute("result", result);
        } catch (IllegalArgumentException e) {
            request.setAttribute("error", e.getMessage());
        }

        request.getRequestDispatcher("calculator.jsp").forward(request, response);
    }
}
