package tazo0519.advanced.app.v5;

import org.springframework.stereotype.Service;
import tazo0519.advanced.trace.callback.TraceTemplate;
import tazo0519.advanced.trace.logtrace.LogTrace;

@Service
public class OrderServiceV5 {

    private final OrderRepositoryV5 orderRepository;
    private final TraceTemplate traceTemplate;

    public OrderServiceV5(OrderRepositoryV5 orderRepository, LogTrace logTrace) {
        this.orderRepository = orderRepository;
        this.traceTemplate = new TraceTemplate(logTrace);
    }

    public void orderItem(String itemId) {
        traceTemplate.execute("OrderController.request()", () -> {
            orderRepository.save(itemId);
            return null;
        });
    }
}
