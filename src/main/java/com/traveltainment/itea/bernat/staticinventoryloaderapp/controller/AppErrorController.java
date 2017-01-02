package com.traveltainment.itea.bernat.staticinventoryloaderapp.controller;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppErrorController
implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @Autowired
    private ErrorAttributes errorAttributes;
    
    @RequestMapping(value={"/error"}, produces={"text/html"})
    public ModelAndView errorHtml(HttpServletRequest request) {
        return new ModelAndView("/errors/error", "attributes", this.getErrorAttributes(request, false));
    }

    @RequestMapping(value={"/error"})
    @ResponseBody
    public ResponseEntity<Map<String, Object>> error(HttpServletRequest request) {
        Map<String, Object> body = this.getErrorAttributes(request, this.getTraceParameter(request));
        HttpStatus status = this.getStatus(request);
        return new ResponseEntity(body, status);
    }

    public String getErrorPath() {
        return "/error";
    }

    private boolean getTraceParameter(HttpServletRequest request) {
        String parameter = request.getParameter("trace");
        if (parameter == null) {
            return false;
        }
        return !"false".equals(parameter.toLowerCase());
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        ServletRequestAttributes requestAttributes = new ServletRequestAttributes(request);
        return this.errorAttributes.getErrorAttributes((RequestAttributes)requestAttributes, includeStackTrace);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
        if (statusCode != null) {
            try {
                return HttpStatus.valueOf((int)statusCode);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }
}

