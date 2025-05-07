package org.example.template_method;

public abstract class CICDPipelines {
    public abstract void build();
    public abstract void test();
    public abstract void deploy();
    public abstract void monitor();
    public void hook1() {}
    public void runAutomation() {
        build();
        test();
        hook1();
        deploy();
        monitor();
    }
}
