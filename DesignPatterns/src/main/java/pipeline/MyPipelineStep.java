package pipeline;

public interface MyPipelineStep<I, O> {
    O process(I input);
}
