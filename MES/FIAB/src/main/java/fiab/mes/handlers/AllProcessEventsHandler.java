package fiab.mes.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class AllProcessEventsHandler implements RequestHandler {
    public static final String EVENT_KEY = "EVENT";
    public static final String EVENT_SLOT = "Event";

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("AllProcessEvents"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        String [] processSteps=new String[]{"Initiate","Available","Active","Canceled","Completed"};
        String speechText;

        if (processSteps.length!= 0) {
           speechText = ("the available process steps are %s" + processSteps);
        }
        else {
            // Since the user's favorite color is not set render an error message.
            speechText =
                    " no process steps available";
        }

        String favoriteColor = (String) input.getAttributesManager().getSessionAttributes().get(EVENT_KEY);

        if (favoriteColor != null && !favoriteColor.isEmpty()) {
            speechText = String.format("the current event is %s", favoriteColor);
        } else {
            // Since the user's favorite color is not set render an error message.
            speechText =
                    "You can start with process steps "
                            + "Initiate";
        }

        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("event", speechText)
                .build();
    }
}
