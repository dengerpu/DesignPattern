package Spring.springmvc;

import org.springframework.web.servlet.DispatcherServlet;

/***
 * @author dep
 * @version 1.0
 * @date 2023-04-07 15:52
 */
public class Responsibility {
    public static void main(String[] args) {
       // DispatcherServlet
        /***
         * 说明：
         *protected void doDispatch(HttpServletRequest request, HttpServletResponse response) throws Exception {
         *     ....
         *     HandlerExecutionChain mappedHandler = null;
         *     ....
         *     mappedHandler = this.getHandler(processedRequest); // 获取HandlerExecutionChain对象
         *      ....
         *      // 在mappedHandler.applyPreHandle 内部得到啦HandlerInterceptor interceptor
         *      //调用了拦截器的interceptor.preHandle
         *      if (!mappedHandler.applyPreHandle(processedRequest, response)) {
         *                         return;
         *                     }
         *  }
         *      //说明: mappedHandler.applyPostHandle方法内部获取到拦截器，并调用
         *      //拦截器的interceptor.postHandle(request, response, this.handler, mv);
         *     mappedHandler.applyPostHandle(processedRequest, response, mv);
         *
         */
    }
}
