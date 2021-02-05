package com.kgc.study.studytravelcoach.security;

import com.kgc.study.service.AdministratorTableService;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Resource
    AdministratorTableService administratorTableService;

    @Resource
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/","/css/**","/fonts/**","/images/**","/js/**","/lib/**","/excel/**")
                .permitAll().anyRequest().authenticated().and().headers().frameOptions().sameOrigin();//进行拦截
        //开启登录功能
        http.formLogin().loginPage("/").loginProcessingUrl("/login").usernameParameter("adminName").passwordParameter("adminPassword")
        .defaultSuccessUrl("/toIndex").failureUrl("/");
        //http.rememberMe().rememberMeParameter("remember");

        //开启注销功能,默认返回登录，logoutSuccessUrl可以指定注销后跳转的页面
        http.logout().logoutSuccessUrl("/");
        http.csrf().disable(); // 禁用CSRF功能，如果不禁用，只能发post请求退出，否则报错
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //数据库认证
        auth.userDetailsService(administratorTableService).passwordEncoder(bCryptPasswordEncoder);

    }

}
