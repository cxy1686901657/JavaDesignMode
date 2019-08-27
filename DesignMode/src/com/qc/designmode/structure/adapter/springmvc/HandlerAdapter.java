package com.qc.designmode.structure.adapter.springmvc;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */

public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}
class SimpleHandlerAdapter implements HandlerAdapter {

    public void handle(Object handler) {
        ((SimpleController) handler).doSimplerHandler();
    }

    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

}
class HttpHandlerAdapter implements HandlerAdapter {

    public void handle(Object handler) {
        ((HttpController) handler).doHttpHandler();
    }

    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

}

class AnnotationHandlerAdapter implements HandlerAdapter {

    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationHandler();
    }

    public boolean supports(Object handler) {

        return (handler instanceof AnnotationController);
    }

}