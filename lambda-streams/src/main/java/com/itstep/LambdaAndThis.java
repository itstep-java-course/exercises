package com.itstep;

public class LambdaAndThis {

    public static void main(String[] args) {
        final LambdaAndThis lambdaAndThis = new LambdaAndThis();

        lambdaAndThis.testThisWithLambda();

        lambdaAndThis.testThisWithAnonymusClass();
    }

    //    test this in lambda
    private void testThisWithLambda() {
        testLambdaThis(()->{
            System.out.println(this.getClass());
            System.out.println("test lambda this");
        });
    }

    private void testThisWithAnonymusClass() {
        testLambdaThis(new TestLambdaThis() {
            @Override
            public void test() {
                System.out.println(this.getClass());
                System.out.println("test anonymus this");
            }
        });
    }

    interface TestLambdaThis {
        void test();
    }

    private void testLambdaThis(TestLambdaThis testLambdaThis) {
        testLambdaThis.test();
    }
}
