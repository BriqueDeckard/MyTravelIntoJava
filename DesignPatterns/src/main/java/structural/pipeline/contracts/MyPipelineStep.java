package structural.pipeline.contracts;

public interface MyPipelineStep<I, O> {
    O process(I input);
}
