package com.jet.evaluate;

public class AssertClass {


    public static void main(String[] args) {
        AssertClass assertClass = new AssertClass();
        //assertClass.sum(13243567, 43344);
        System.out.println();

        int value = 15;
        assert value >= 20 : "Error message";
        System.out.println("value is "+value);


        System.out.printf("古典风格的斯蒂芬森的 的粉丝粉丝 地方斯蒂芬 风俗的  的风俗地方");
        System.out.println(
        );

        System.out.println("地方官府 法国 其巍 dfgfd" +
                " gdfgdfg gfdgdf " +
                "气温二统一 气温二问题 气温二统一 个哦噢的 个哦噢  气温峨峨 气温峨峨 气温峨峨 气温峨峨 企鹅其 气温峨峨 气温哦亲巍峨 气温峨峨 气温峨峨清娥娥 的的酒店客房佛教 佛教佛教佛教的快速 方法可劳斯莱斯 " +
                "发挥防洪热可 了苏联贷款的 贷款贷款的可哦额外 解放军副 峨峨 反馈方可佛科普为 俄文及人物恶劣 人均恶劣 俄文历任军委 维尔吉利王 而建立为 " +
                "维尔巍峨 哦热 而为哦热为 为哦热为人 沃尔沃而 沃尔沃而 沃尔沃而 沃尔沃而 尔维尔 work 地方 饭店饭店副 的负担份额 规范股份 ");

        System.out.println("fdskljfoewjro v dnkjgnoeijweiojd cfkffmvcmvcmkekoe dsmdlf,mvmeoweopwm cv ffjfkrkfmv good good food nfdkl fjfjn ddkdvf");
        System.out.println(
        );
        System.out.println();


    }

    public int sum(int a, int b) {
        assert (Integer.MAX_VALUE - a >= b) : "Value of " + a + " + " + b + " is too large to add.";
        final int result = a + b +1000;
        assert (result - a == b) : "Sum of " + a + " + " + b + " returned wrong sum " + result;
        return result;
    }
}
