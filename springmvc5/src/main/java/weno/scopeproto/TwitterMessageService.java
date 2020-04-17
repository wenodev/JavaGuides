package weno.scopeproto;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TwitterMessageService implements MessageService {

    private String message;

    @Override
    public String getMessage() {
        return null;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}
