package tazo0519.advanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tazo0519.advanced.trace.logtrace.FieldLogTrace;
import tazo0519.advanced.trace.logtrace.LogTrace;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new FieldLogTrace();
    }
}
