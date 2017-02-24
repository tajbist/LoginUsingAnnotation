package com.dev.web.exception;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Oops on 2/20/2017.
 */
public class MyAccessDeniedHandler implements AccessDeniedHandler {
    public String errpage;

    public String getErrpage() {
        return errpage;
    }

    public void setErrpage(String errpage) {
        this.errpage = errpage;
    }

    public MyAccessDeniedHandler() {
    }

    public MyAccessDeniedHandler(String errpage) {
        this.errpage = errpage;
    }

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.sendRedirect(errpage);
    }
}
