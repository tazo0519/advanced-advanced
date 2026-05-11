package tazo0519.advanced;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tazo0519.advanced.trace.logtrace.LogTrace;
import tazo0519.advanced.trace.logtrace.ThreadLocalLogTrace;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
