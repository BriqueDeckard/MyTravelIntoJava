package pipeline.domain;

import pipeline.contracts.MyPipelineStep;

public class MyConcretePipelineStepB implements MyPipelineStep<String, String> {
    @Override
    public String process(String input) {
        return "-" + input + "-";
    }
}
