package pl.pjatk.TomWas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class First {

    public First(@Value("${my.first.value}") String value) {
        System.out.println(value);
    }
    @Bean
    public void printFirstMessage() {
        System.out.println("message from first");
    }

}
