package pipeline;

import pipeline.domain.MyConcretePipelineStepA;
import pipeline.domain.MyConcretePipelineStepB;
import pipeline.domain.MyPipeline;

public class MyPipelineApp {
    public static void main(String[] args) {
        MyPipeline myPipeline = new MyPipeline();
        myPipeline.addStep(new MyConcretePipelineStepA());
        myPipeline.addStep(new MyConcretePipelineStepB());

        String input = "Hello world!";
        String  output = myPipeline.executePipeline(input);
        System.out.println(output);
    }
}
