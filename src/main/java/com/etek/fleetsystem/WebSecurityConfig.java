//package com.etek.fleetsystem;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http
//			.authorizeHttpRequests((requests) -> requests
//				.requestMatchers("/", "/index").permitAll()
//				.requestMatchers("/login", "/resources/**", "/js","/css/**", "/fonts/**", "/img/**").permitAll()
//				.requestMatchers("/register", "/js/**", "/resources/**", "/css/**", "/fonts/**", "/img/**").permitAll()
//				.anyRequest().authenticated()
//			)
//			.formLogin((form) -> form
//				.loginPage("/login")
//				.permitAll()
//			)
//			.logout((logout) -> logout.permitAll());
//
//		return http.build();
//	}
//
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
//	
//	@Bean
//	public BCryptPasswordEncoder bCryptPasswordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//	
//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		
//		provider.setUserDetailsService(userDetailsService);
//		
//		provider.setPasswordEncoder(bCryptPasswordEncoder());
//		
//		return provider;
//	}
//}