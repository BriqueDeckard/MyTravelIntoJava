package design_patterns.pipeline;

public class MyConcretePipelineStepA implements MyPipelineStep<String, String>{
    @Override
    public String process(String input) {
        return "#" + input + "#";
    }
}
