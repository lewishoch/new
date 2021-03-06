package ui.account;

import java.io.IOException;

import javax.jms.JMSException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import po.Merchant;
import jms.producer.JMSProducer;
import jms.producer.impl.PtpProducer;



/**
 * Servlet implementation class SignUpServlet
 */
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final JMSProducer jmsProjecter = PtpProducer.getInstance();
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		boolean isValidAccount = false;
		boolean isValidShop = false;
		boolean isSuccess = false;
		
		// account info
		String mname = (String)request.getParameter("mname");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = (String)request.getParameter("gender");

		// shop info
		String shopName = (String)request.getParameter("shopName");
		String address = (String)request.getParameter("address");
		String telno = (String)request.getParameter("telno");

		// create po
		Merchant merchant = new Merchant();
		merchant.setAge(age);
		merchant.setGender(gender);
		merchant.setName(mname);
		merchant.setShopName(shopName);
		merchant.setShopAddress(address);
		merchant.setShopTelno(telno);

		// query db find all user
		
		//request.getRequestDispatcher("listAllUsers").forward(request,response);
		response.sendRedirect("listAllUsers");
		
		// select distinct account, shop
		
		if(isValidAccount && isValidShop){
			// db insert
			isSuccess = true;
			
			if(isSuccess);
			else ;
		}
		
	}

	private void sendMsg(String msg){
		try {
			jmsProjecter.sendMsg(msg);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private boolean uploadFile(){
		return false;
	}
}
