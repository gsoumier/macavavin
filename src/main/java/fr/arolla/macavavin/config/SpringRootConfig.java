package fr.arolla.macavavin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "fr.arolla.macavavin.services" })
public class SpringRootConfig {
}
