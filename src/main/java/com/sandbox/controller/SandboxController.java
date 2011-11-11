package com.sandbox.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SandboxController {

    private static final Log LOG = LogFactory.getLog(SandboxController.class);

    @RequestMapping("/")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("index.html");
    }

    @RequestMapping("/aController")
    public void sayHello(HttpServletResponse response) throws IOException {
        if (LOG.isDebugEnabled()) {
            LOG.debug("Passing through my controller");
        }
        response.sendError(500, "Here's a controller in action");
    }
}
