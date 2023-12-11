package structural.pipeline.domain;

import structural.pipeline.contracts.MyPipelineStep;

public class MyConcretePipelineStepA implements MyPipelineStep<String, String> {
    @Override
    public String process(String input) {
        return "#" + input + "#";
    }
}
