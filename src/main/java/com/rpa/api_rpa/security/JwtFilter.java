package com.rpa.api_rpa.security;
import java.io.IOException;

// import javax.servlet.FilterChain;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRequest;
// import javax.servlet.ServletResponse;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

import org.springframework.core.env.Environment;
import org.springframework.web.filter.GenericFilterBean;

import com.rpa.api_rpa.commun.AuthUtils;;



public class JwtFilter {

}
// public class JwtFilter extends GenericFilterBean {

// 	private Environment env;

// 	public JwtFilter(Environment env) {
// 		this.env = env;
// 	}
// 	public void doFilter(final ServletRequest req, final ServletResponse res, final FilterChain chain)
// 			throws IOException, ServletException {

// 		final HttpServletRequest request = (HttpServletRequest) req;
// 		final HttpServletResponse response = (HttpServletResponse) res;
// 		final String authHeader = request.getHeader("authorization");

// 		if (env.getProperty("env.name").equals("prod")||env.getProperty("env.name").equals("prep")) {
// 			response.setHeader("Access-Control-Allow-Origin", "*");
// 			response.setHeader("Access-Control-Allow-Credentials", "true");
// 			response.setHeader("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
// 			response.setHeader("Access-Control-Allow-Headers"
// 			, "Access-Control-Allow-Headers, Origin,Accept, X-Requested-With, Content-Type, Access-Control-Request-Method, Access-Control-Request-Headers, Authorization");
// 		}
// 		if ("OPTIONS".equals(request.getMethod())) {
// 			response.setStatus(HttpServletResponse.SC_OK);
// 			chain.doFilter(req, res);
// 		} else {
// 			if (!request.getRequestURL().toString().contains("/secure")) {
// 				chain.doFilter(req, res);
// 				return;
// 			}
// 			if (authHeader == null || !authHeader.startsWith("Bearer ")) {
// 				System.out.println("Missing or invalid Authorization header");
// 				throw new ServletException("Missing or invalid Authorization header");
// 			}

// 			final String token = authHeader.substring(7);
// 			String source = req.getParameter("source");
// 			if (AuthUtils.isTokenVerified(token, source, env)) {
// 				request.setAttribute("claims", true);
// 			} else {
// 				throw new ServletException("Invalid token");
// 			}
// 			chain.doFilter(req, res);
// 		}
// 	}
// }