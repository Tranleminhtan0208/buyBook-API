// package com.example.BUYBOOK.security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.web.SecurityFilterChain;

// @EnableWebSecurity
// public class SecurityConfig {

//     public SecurityFilterChain configure(HttpSecurity http) throws Exception {
//         return http
//                 .csrf(csrf -> csrf.disable())
//                 .authorizeRequests()
//                 .antMatchers("/public/**").permitAll() // Các URL công khai
//                 .antMatchers("/secure/**").authenticated() // Các URL cần xác thực
//                 .and()
//                 .formLogin()
//                 .loginPage("/login") // Trang đăng nhập
//                 .defaultSuccessURL("/secure/home") // Trang sau khi đăng nhập thành công
//                 .and()
//                 .logout()
//                 .logoutUrl("/logout") // URL đăng xuất
//                 .logoutSuccessUrl("/login?logout") // Trang sau khi đăng xuất
//                 return http.build();
//     }

//     @Bean
//     public AuthenticationManager customAuthenticationManager() throws Exception {
//         return authenticationManager();
//     }
// }
