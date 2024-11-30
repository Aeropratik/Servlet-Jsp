package myPackCalc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String [] quotes = {
			"Success is the sum of small efforts, repeated day in and day out.",
			"Success doesn't come to you, you've got to go to it.",
			"There's no substitute for hard work.",
			"You have to believe in yourself when no one else does.",
			"The expert in anything was once a beginner.",
	};
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("number1");
		String str2= request.getParameter("number2");
		
		String str3= request.getParameter("btn1");
		
		//Type Casting
		int a= Integer.parseInt(str1);
		int b= Integer.parseInt(str2);
		
		//int sum = number1+number2;
		int ans;
		
		// logic
		/*
		 * if(str3.equals("1")) ans=number1+number2; else
		 * if(str3.equals("2"))ans=number1-number2; else
		 * if(str3.equals("3"))ans=number1*number2; else ans=number1/number2;
		 */
		
		switch (str3) {
	    case "1":
	        ans = a + b;
	        break;
	    case "2":
	        ans = a - b;
	        break;
	    case "3":
	        ans = a * b;
	        break;
	    default:
	        ans = a / b; // Assuming number2 is non-zero.
	        
	}
		//response.getWriter().append("ANSWER ="+ans);
		//response.sendRedirect("result.jsp?ans="+ans);
		
		//Quotes
		int randomIndex =(int) (Math.random() * quotes.length);
		String randomquote = quotes[randomIndex];
		
		response.sendRedirect("result.jsp?ans="+ans+"&quotes="+randomquote);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
