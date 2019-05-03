package demo;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.test.ProcessEngineRule;
import org.camunda.bpm.extension.process_test_coverage.junit.rules.ProcessCoverageInMemProcessEngineConfiguration;
import org.camunda.bpm.extension.process_test_coverage.junit.rules.TestCoverageProcessEngineRuleBuilder;
import org.junit.ClassRule;
import org.junit.Rule;

public abstract class ProcessDefinitionTest {

    private static final ProcessEngine processEngine = new ProcessCoverageInMemProcessEngineConfiguration().buildProcessEngine();

    @Rule
    @ClassRule
    public static final ProcessEngineRule processEngineRule = TestCoverageProcessEngineRuleBuilder.create(processEngine).assertClassCoverageAtLeast(0.1).build();

}
