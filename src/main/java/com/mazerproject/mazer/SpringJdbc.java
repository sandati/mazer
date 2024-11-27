/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mazerproject.mazer;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.javalite.activejdbc.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;


/**
 *
 * @author yahaya
 */
@WebFilter("/*")
public class SpringJdbc implements Filter {
    @Autowired
    private Environment env;
    
    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request,response);
        
        String driver = env.getProperty("app.db.driver");
        String url = env.getProperty("app.db.url");
        String user = env.getProperty("app.db.user");
        String password = env.getProperty("app.db.password");
        
        try{
            Base.open(driver, url, user, password);
            Base.openTransaction();
            chain.doFilter(request, response);
            Base.commitTransaction();
        }
        catch (IOException | ServletException e){
            Base.rollbackTransaction();
            throw e;
        }
        finally{
            Base.close();
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void destroy() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
