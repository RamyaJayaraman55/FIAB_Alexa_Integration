package fiab.mes.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class HelpIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AMAZON.HelpIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String speechText = "You can tell any process event";
        String repromptText = "Please tell me any event name like initiate";

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Events", speechText)
                .withReprompt(repromptText)
                .withShouldEndSession(false)
                .build();
    }
}
