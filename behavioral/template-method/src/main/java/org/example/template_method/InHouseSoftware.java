package org.example.template_method;

public class InHouseSoftware extends CICDPipelines{

    @Override
    public void build() {
        System.out.println("In-house Software : build");
    }

    @Override
    public void test() {
        System.out.println("In-house Software : test");
    }

    @Override
    public void deploy() {
        System.out.println("In-house Software : deploy");
    }

    @Override
    public void monitor() {
        System.out.println("In-house Software : monitor");
    }
}
