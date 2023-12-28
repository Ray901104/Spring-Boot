package hello.importselector;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

class HelloImportSelectorTest {

    /**
     * 정적인 구성
     */
    @Test
    void staticConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StaticConfig.class);
        HelloBean bean = context.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    /**
     * 동적인 구성
     */
    @Test
    void selectorConfig() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SelectorConfig.class);
        HelloBean bean = context.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Configuration
    @Import(HelloConfig.class)
    public static class StaticConfig {
    }

    @Configuration
    @Import(HelloImportSelector.class)
    public static class SelectorConfig {
    }
}
