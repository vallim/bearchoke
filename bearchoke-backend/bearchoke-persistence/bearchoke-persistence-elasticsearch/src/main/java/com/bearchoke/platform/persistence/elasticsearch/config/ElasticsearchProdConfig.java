/*
 * Copyright (c) 2015. Bearchoke
 */

package com.traveliko.platform.persistence.search.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource(value = "classpath:elasticsearch-prod.properties")
public class ElasticsearchProdConfig {
}