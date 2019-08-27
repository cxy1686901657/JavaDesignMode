package com.qc.designmode.structure.adapter.springmvc;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */
public interface Controller {
}
class HttpController implements Controller {
    public void doHttpHandler() {
        System.out.println("http...");
    }
}

class SimpleController implements Controller {
    public void doSimplerHandler() {
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationHandler() {
        System.out.println("annotation...");
    }
}
