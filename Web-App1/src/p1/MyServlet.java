package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter(); 
		out.print("<b><u> Hello User  </u></b>");
		System.out.println("hello ");
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String productName = req.getParameter("productName");
		int productCost = Integer.parseInt(req.getParameter("productCost"));
		String category = null;

		// if-else
		if(productName.equals("laptop")) category = "technical";
		if(productName.equals("watch")) category = "Consumer-product";
		
		// user
		Product p = new Product(productName, productCost, category);
		

		
		
		// DAO class
		
		// DAO() -> validateUser()
		
		
		
		PrintWriter out = resp.getWriter(); // 
		out.print(p);
		// Valid- user
		// invalid-user
		
	}

}







