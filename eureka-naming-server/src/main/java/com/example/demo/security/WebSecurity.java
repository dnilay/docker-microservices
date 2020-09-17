/*
 * package com.example.demo.security; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.password.NoOpPasswordEncoder;
 * 
 * @EnableWebSecurity public class WebSecurity extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override public void configure(AuthenticationManagerBuilder auth) throws
 * Exception { auth.inMemoryAuthentication()
 * .passwordEncoder(NoOpPasswordEncoder.getInstance())
 * .withUser("admin").password("admin") .authorities("ADMIN"); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and()
 * .csrf().disable(); } }
 */