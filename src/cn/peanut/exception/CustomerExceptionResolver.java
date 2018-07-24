package cn.peanut.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//异常处理器实现类
public class CustomerExceptionResolver implements HandlerExceptionResolver {

//    obj发生异常的地方:包名+类名+方法名+形参
//    日志的意义:1.发布tomcat war包  并不在开发工具中
//    2.发布tomcat 在服务器上Linux系统不会自动打印错误，就需要Log4j来打印

    public ModelAndView resolveException(HttpServletRequest request,
                                         HttpServletResponse response, Object obj, Exception e) {
        ModelAndView mav = new ModelAndView();
        if(e instanceof MessageException){
            //预期异常
            MessageException me = (MessageException)e;
            mav.addObject("error",me.getMsg());
            mav.setViewName("/error");
        }else{
            //无脑返回首页
            mav.addObject("error","未知异常");
            mav.setViewName("/error");
        }

        return mav;
    }
}
