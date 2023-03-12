package pl.pjatk.TomWas;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class New {
    public New(ApplicationContext context) {
        First first = context.getBean("first", First.class);
        Second second = context.getBean("second", Second.class);
        }
    }

