package demo;

import org.camunda.bpm.engine.test.Deployment;
import org.junit.Test;

@Deployment(resources = "processes/Process_1.bpmn")
public class Process1Test extends ProcessDefinitionTest {

    @Test
    public void runProcess1() {
        processEngineRule.getRuntimeService().startProcessInstanceByKey("Process_1");
    }
}
