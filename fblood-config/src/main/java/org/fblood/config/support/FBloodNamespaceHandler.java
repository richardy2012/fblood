package org.fblood.config.support;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by yuantao on 2015/3/27.
 */
public class FBloodNamespaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("app", new AppDefinitionParser());
        registerBeanDefinitionParser("zookeeper", new ZookeeperDefinitionParser());
        registerBeanDefinitionParser("provider", new ProviderDefinitionParser());
        registerBeanDefinitionParser("remoteInject", new ProviderDefinitionParser());
    }

}