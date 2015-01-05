/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.spring.boot;

import static java.util.Arrays.asList;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

@Configuration
public class SpringConversionServiceConfiguration {

    @ConditionalOnMissingBean
    @Bean
    ConversionService conversionService(ApplicationContext applicationContext) {
        DefaultConversionService service = new DefaultConversionService();
        for (Converter converter : applicationContext.getBeansOfType(Converter.class).values()) {
            service.addConverter(converter);
        }
        return service;
    }

    @Bean
    SpringTypeConverter springTypeConverter(ConversionService[] conversionServices) {
        return new SpringTypeConverter(asList(conversionServices));
    }

}
