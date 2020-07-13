package com.ngr.orderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.jaegertracing.Configuration;
import io.jaegertracing.Configuration.ReporterConfiguration;
import io.jaegertracing.Configuration.SamplerConfiguration;
import io.jaegertracing.internal.samplers.ProbabilisticSampler;

@SpringBootApplication
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	
	@Bean
    public static io.opentracing.Tracer getTracer() {
        SamplerConfiguration samplerConfig = SamplerConfiguration.fromEnv().withType(ProbabilisticSampler.TYPE).withParam(1);
        ReporterConfiguration reporterConfig = Configuration.ReporterConfiguration.fromEnv();
        Configuration config = new Configuration("Order service").withSampler(samplerConfig).withReporter(reporterConfig);
        return config.getTracer();
    }
}
