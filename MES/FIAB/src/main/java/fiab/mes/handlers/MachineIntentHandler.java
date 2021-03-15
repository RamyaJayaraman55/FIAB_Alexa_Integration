package fiab.mes.handlers;


import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

import static com.amazon.ask.request.Predicates.intentName;


public class MachineIntentHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput handlerInput) {
        return handlerInput.matches(intentName("MachineIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput handlerInput) {

        int[] machinesAvailable = IntStream.rangeClosed(1, 4).toArray();
        //int[] range = IntStream.iterate(1, n -> n + 1).limit(10).toArray();
         String speechText;

        if (machinesAvailable.length!= 0 ) {
            speechText = ("the available machines are %d" + Arrays.toString(machinesAvailable)) ;

        } else {
            // Since the user's favorite color is not set render an error message.
            speechText =
                    "no machines are available "
                            + "Initiate";
        }
        return handlerInput.getResponseBuilder()
                .withSpeech(speechText)

                .withSimpleCard("event", speechText)
                .build();

    }
}
