/*
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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.iam.IAMComponent;

/**
 * Manage AWS IAM instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsIamComponentBuilderFactory {

    /**
     * AWS Identity and Access Management (IAM) (camel-aws-iam)
     * Manage AWS IAM instances.
     * 
     * Category: cloud,management
     * Since: 2.23
     * Maven coordinates: org.apache.camel:camel-aws-iam
     * 
     * @return the dsl builder
     */
    @Deprecated
    static AwsIamComponentBuilder awsIam() {
        return new AwsIamComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Identity and Access Management (IAM) component.
     */
    interface AwsIamComponentBuilder extends ComponentBuilder<IAMComponent> {
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws.iam.IAMConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder configuration(
                org.apache.camel.component.aws.iam.IAMConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a existing configured AWS IAM as client.
         * 
         * The option is a:
         * &lt;code&gt;com.amazonaws.services.identitymanagement.AmazonIdentityManagement&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param iamClient the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder iamClient(
                com.amazonaws.services.identitymanagement.AmazonIdentityManagement iamClient) {
            doSetProperty("iamClient", iamClient);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws.iam.IAMOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder operation(
                org.apache.camel.component.aws.iam.IAMOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the IAM client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the IAM client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the IAM client.
         * 
         * The option is a: &lt;code&gt;com.amazonaws.Protocol&lt;/code&gt;
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which IAM client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default AwsIamComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class AwsIamComponentBuilderImpl
            extends
                AbstractComponentBuilder<IAMComponent>
            implements
                AwsIamComponentBuilder {
        @Override
        protected IAMComponent buildConcreteComponent() {
            return new IAMComponent();
        }
        private org.apache.camel.component.aws.iam.IAMConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.iam.IAMComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.iam.IAMConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoDiscoverClient": getOrCreateConfiguration((IAMComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((IAMComponent) component).setAccessKey((java.lang.String) value); return true;
            case "configuration": ((IAMComponent) component).setConfiguration((org.apache.camel.component.aws.iam.IAMConfiguration) value); return true;
            case "iamClient": getOrCreateConfiguration((IAMComponent) component).setIamClient((com.amazonaws.services.identitymanagement.AmazonIdentityManagement) value); return true;
            case "lazyStartProducer": ((IAMComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((IAMComponent) component).setOperation((org.apache.camel.component.aws.iam.IAMOperations) value); return true;
            case "proxyHost": getOrCreateConfiguration((IAMComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((IAMComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((IAMComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((IAMComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((IAMComponent) component).setSecretKey((java.lang.String) value); return true;
            case "autowiredEnabled": ((IAMComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}