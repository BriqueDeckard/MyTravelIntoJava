package pipeline;

public class MyConcretePipelineStepB implements MyPipelineStep<String, String>{
    @Override
    public String process(String input) {
        return "-" + input + "-";
    }
}
