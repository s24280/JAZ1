package pl.pjatk.TomWas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Second {
    public Second(@Value("${my.second.value}") String second){
        System.out.println(second);
    }

@Bean
    public void printSecondMessage() {
        System.out.println("second message");
    }
}
