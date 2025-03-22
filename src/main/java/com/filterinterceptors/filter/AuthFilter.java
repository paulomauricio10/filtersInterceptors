package com.filterinterceptors.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;
import java.util.Optional;

@Component
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        System.out.println("> Filter: " + new ObjectMapper().writeValueAsString(Map.of(
            "method", req.getMethod(),
            "path", req.getRequestURI(),
            "auth_header", Optional.ofNullable(req.getHeader(HttpHeaders.AUTHORIZATION)).orElse("")
        )));

        chain.doFilter(request, response);
    }
}
