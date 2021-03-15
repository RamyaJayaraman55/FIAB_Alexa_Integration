package fiab.mes.streamHandler;


import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import fiab.mes.handlers.*;

public class AlexaProcessEventHandler extends SkillStreamHandler {
   private static Skill getSkill() {
        return Skills.standard()

               .addRequestHandlers(
                       new CancelandStopIntentHandler(),
                       new AllProcessEventsHandler(),
                       new CurrentProcessEventHandler(),
                       new HelpIntentHandler(),
                       new LaunchRequestHandler())
//
               .withSkillId("amzn1.ask.skill.0869062c-bfff-41af-9451-c573689bdbde")

                .build();
    }
//
   public AlexaProcessEventHandler() {
       super(getSkill());
  }
//
}
