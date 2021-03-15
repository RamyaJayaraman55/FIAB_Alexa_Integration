package fiab.mes.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.*;
import com.amazon.ask.response.ResponseBuilder;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;
import static fiab.mes.handlers.AllProcessEventsHandler.EVENT_KEY;
import static fiab.mes.handlers.AllProcessEventsHandler.EVENT_SLOT;
//import com.amazon.ask.request.RequestHelper;

public class CurrentProcessEventHandler implements RequestHandler{
    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("CurrentProcessEvent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {
        Request request = handlerInput.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();
        Map<String, Slot> slots = intent.getSlots();
        // Get the color slot from the list of slots.
        Slot favoriteColorSlot = slots.get(EVENT_SLOT);

        String  speechText,repromptText;
        boolean isAskResponse = false;

        // Check for favorite color and create output to user.
        if (favoriteColorSlot != null) {
            // Store the user's favorite color in the Session and create response.
            String eventName = favoriteColorSlot.getValue();
            handlerInput.getAttributesManager().setSessionAttributes(Collections.singletonMap(EVENT_KEY, eventName));

            speechText =
                    String.format("I now know that current ongoing process is %s."
                            +  eventName);
            repromptText =
                    "You can ask me the ongoing event?";

        }else {

            speechText = "I'm not sure what your EVENT is, please try again";
            repromptText =
                    "I'm not sure what your EVENT is. You can tell me your EVENT "
                            + " by saying, my EVENT is ACTIVE";
            isAskResponse = true;
//        <emphasis level=\"strong\">Hello</emphasis> World! " +
//                "<say-as interpret-as=\"interjection\">woo hoo</say-as>!"
//}
        }
        ResponseBuilder responseBuilder = handlerInput.getResponseBuilder();

        responseBuilder.withSimpleCard("EVENTS", speechText)
                .withSpeech(speechText)
                .withShouldEndSession(false);

        if (isAskResponse) {
            String cardTitle = "This is the Title of the Card";
            String cardText = "This is the card content. " +
                    "This card just has plain text content." +
                    "\r\nThe content is formated with line " +
                    "breaks to improve readability.";
            responseBuilder.withShouldEndSession(false)
                    .withReprompt(repromptText)
              .withSimpleCard(cardTitle, cardText);
        }
        return responseBuilder.build();

    }
}
