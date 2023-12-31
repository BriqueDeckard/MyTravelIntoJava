package structural.pipeline.domain;

import java.util.ArrayList;
import java.util.List;
import structural.pipeline.contracts.MyPipelineStep;

public class MyPipeline {
    private final List<MyPipelineStep<? , ?>> steps = new ArrayList<>();

    public <I, O> void addStep(MyPipelineStep<? ,?> step){
        steps.add(step);
    }

    public <I, O> O executePipeline(I input){
        Object result = input;
        for(MyPipelineStep<?, ?> step : steps){
            MyPipelineStep<Object, Object> currentStep =
                    (MyPipelineStep<Object, Object>) step;
            result = currentStep.process(result);
        }
        return (O) result;
    }
}
