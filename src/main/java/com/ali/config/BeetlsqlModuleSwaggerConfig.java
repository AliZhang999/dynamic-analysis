package com.ali.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootConfiguration
@EnableSwagger2
public class BeetlsqlModuleSwaggerConfig {

    @Bean
    public Docket szdw_api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("师资队伍")
                .apiInfo(apiInfo("师资队伍","1.0",""))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/dynamicAnalysis/szdw/**"))
                .build();
    }

    @Bean
    public Docket kyxm_api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("科研项目")
                .apiInfo(apiInfo("科研项目","1.0",""))
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/dynamicAnalysis/kyxm/**"))
                .build();
    }

    private ApiInfo apiInfo(String title,String version,String desc){
        return new ApiInfoBuilder()
                .title(title)
                .version(version)
                .description(desc)
                .build();
    }
}
