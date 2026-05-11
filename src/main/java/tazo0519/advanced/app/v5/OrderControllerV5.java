package tazo0519.advanced.app.v5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tazo0519.advanced.trace.callback.TraceTemplate;
import tazo0519.advanced.trace.logtrace.LogTrace;

@RestController
public class OrderControllerV5 {

    private final OrderServiceV5 orderService;

    public OrderControllerV5(OrderServiceV5 orderService, LogTrace logTrace) {
        this.orderService = orderService;
        this.traceTemplate = new TraceTemplate(logTrace);
    }

    private final TraceTemplate traceTemplate;

    @GetMapping("/v5/request")
    public String request(String itemId) {
        return traceTemplate.execute("OrderController.request()", () -> {
            orderService.orderItem(itemId);
            return "ok";
        });
    }
}
