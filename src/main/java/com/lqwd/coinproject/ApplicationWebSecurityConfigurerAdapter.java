package com.lqwd.coinproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ApplicationWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		 auth.inMemoryAuthentication()
         .withUser("admin").password(passwordEncoder().encode("admin"))
         .roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		
		http
		.httpBasic()
        .and()
        .authorizeRequests()
		.antMatchers("/coins").permitAll()
		.antMatchers("/coins/search").permitAll()
		.antMatchers("/**").hasRole("USER")
		.and()
        .csrf().disable()
        .formLogin().disable();
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
