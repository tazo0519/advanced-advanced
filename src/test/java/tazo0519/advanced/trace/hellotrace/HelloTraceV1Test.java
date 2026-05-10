package tazo0519.advanced.trace.hellotrace;

import org.junit.jupiter.api.Test;
import tazo0519.advanced.trace.TraceStatus;

class HelloTraceV1Test {

    @Test
    void begin_end() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus traceStatus = trace.begin("hello");
        trace.end(traceStatus);
    }

    @Test
    void begin_exception() {
        HelloTraceV1 trace = new HelloTraceV1();
        TraceStatus traceStatus = trace.begin("hello");
        trace.exception(traceStatus, new IllegalArgumentException());
    }

    @Test
    void exception() {
    }
}