package org.example.template_method;

public class CommercialSoftware extends CICDPipelines{
    @Override
    public void build() {
        System.out.println("Commercial Software : build");
    }

    @Override
    public void test() {
        System.out.println("Commercial Software : test");
    }

    @Override
    public void deploy() {
        System.out.println("Commercial Software : deploy");
    }

    @Override
    public void monitor() {
        System.out.println("Commercial Software : monitor");
    }

    @Override
    public void hook1() {
        System.out.println("Add Security");
    }
}
