package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MultiplicationModel;

/**
 * Servlet implementation class MultiplicationServlet
 */
@WebServlet("/MultiplicationServlet")
public class MultiplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplicationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		MultiplicationModel multiplication = new MultiplicationModel(Integer.parseInt(num1), Integer.parseInt(num2));
		
		request.setAttribute("userMultiplication", multiplication);
		
		getServletContext().getRequestDispatcher("/multiplyResult.jsp").forward(request, response);
		
		PrintWriter writer = response.getWriter();
		writer.close();
	}

}
