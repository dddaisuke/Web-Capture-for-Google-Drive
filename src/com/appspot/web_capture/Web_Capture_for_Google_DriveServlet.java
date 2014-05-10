package com.appspot.web_capture;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Web_Capture_for_Google_DriveServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
