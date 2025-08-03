package com.groupeisi.DevoirSoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;
import org.springframework.core.io.ClassPathResource;

@EnableWs
@Configuration
public class SoapWebServiceConfig {

    // Configuration du dispatcher servlet pour gérer les requêtes SOAP
    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true); // transforme les URLs WSDL en chemins corrects
        return new ServletRegistrationBean<>(servlet, "/ws/*");
    }

    // Définition du WSDL pour les classes
    @Bean(name = "classes") // WSDL accessible via /ws/classes.wsdl
    public DefaultWsdl11Definition classesWsdl(XsdSchema classeSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("ClassePort");
        definition.setTargetNamespace("http://groupeisi.com/DevoirSoap"); // doit matcher le .xsd
        definition.setLocationUri("/ws");
        definition.setSchema(classeSchema);
        return definition;
    }

    // Définition du WSDL pour les sectors
    @Bean(name = "sectors") // WSDL accessible via /ws/sectors.wsdl
    public DefaultWsdl11Definition sectorsWsdl(XsdSchema sectorSchema) {
        DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
        definition.setPortTypeName("SectorPort");
        definition.setTargetNamespace("http://groupeisi.com/DevoirSoap"); // même targetNamespace
        definition.setLocationUri("/ws");
        definition.setSchema(sectorSchema);
        return definition;
    }

    // Charge le fichier classedevoir.xsd
    @Bean
    public XsdSchema classeSchema() {
        return new SimpleXsdSchema(new ClassPathResource("schema/classedevoir.xsd"));
    }

    // Charge le fichier sector.xsd
    @Bean
    public XsdSchema sectorSchema() {
        return new SimpleXsdSchema(new ClassPathResource("schema/sector.xsd"));
    }
}
