import com.github.frapontillo.pulse.crowd.data.entity.Message;
import com.github.frapontillo.pulse.spi.IPlugin;
import rx.Observable;
import rx.Subscriber;
import rx.observers.SafeSubscriber;

public class MessageLabellerPlugin extends IPlugin<Message,Message,MessageLabellerConfig> {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public MessageLabellerConfig getNewParameter() {
        return new MessageLabellerConfig();
    }

    @Override
    protected Observable.Operator<Message, Message> getOperator(MessageLabellerConfig messageLabellerConfig) {
        return subscriber -> new SafeSubscriber<>(new Subscriber<Message>() {

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Message message) {

            }
        });
    }
}
