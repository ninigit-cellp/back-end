package org.nini.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	  @Override protected void configure(HttpSecurity http) throws Exception {
		  http.csrf().
	        disable()
	            .authorizeRequests()             
	            .anyRequest()
	            .authenticated()
	            .and()
	            .httpBasic()
	            .and()
	            .cors();
	  
	  }
	 
	 
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/api/v1/voitures");
        
    }
    
    
}
