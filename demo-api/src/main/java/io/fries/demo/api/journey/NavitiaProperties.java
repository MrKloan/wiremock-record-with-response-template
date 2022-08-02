package io.fries.demo.api.journey;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties("demo.navitia")
@ConstructorBinding
public record NavitiaProperties(
        String endpoint,
        String token
) {
}
