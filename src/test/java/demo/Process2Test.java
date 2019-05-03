package demo;

import org.camunda.bpm.engine.test.Deployment;
import org.junit.Test;

@Deployment(resources = "processes/Process_2.bpmn")
public class Process2Test extends ProcessDefinitionTest {

    @Test
    public void runProcess2() {
        processEngineRule.getRuntimeService().startProcessInstanceByKey("Process_2");
    }
}
