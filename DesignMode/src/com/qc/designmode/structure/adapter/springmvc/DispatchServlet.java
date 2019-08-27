package com.qc.designmode.structure.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qc
 * @date 2019/8/27
 * @description
 * @project JavaDesignMode
 */

public class DispatchServlet {
    private List<HandlerAdapter> handlerAdapters = new ArrayList<>();

    {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public DispatchServlet() {

    }
    public void doDispatch() {

        // 此处模拟SpringMVC从request取handler的对象，
        // 适配器可以获取到希望的Controller
//        Controller controller=HandlerMapping.getHandlerMapping();
        HttpController controller = new HttpController();
        // AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();
        // 得到对应适配器
        HandlerAdapter adapter = getHandler(controller);
        // 通过适配器执行对应的controller对应方法
        adapter.handle(controller);

    }

    private HandlerAdapter getHandler(HttpController controller) {
        for (HandlerAdapter adapter:handlerAdapters){
            if(adapter.supports(controller)){
                return adapter;
            }
        }
        return null;
    }
    public static void main(String[] args){
        new DispatchServlet().doDispatch();
    }
}
