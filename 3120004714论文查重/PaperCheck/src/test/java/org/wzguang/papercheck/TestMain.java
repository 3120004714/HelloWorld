package org.wzguang.papercheck;

import org.junit.Test;


public class TestMain {
    /**
     * 测试源文件路径为null的情况
     */
    @Test
    public void testForOriginalArticleNull(){
//        Assert.assertThrows()
        Main.main(new String[]{null,"D:\\测试文件\\orig_0.8_add.txt","D:\\测试文件\\查重结果.txt"});
    }


    /**
     * 测试对比文件路径为null的情况
     */
    @Test
    public void testForPlagiarismArticleNull(){
        Main.main(new String[]{"D:\\测试文件\\orig.txt",null,"D:\\测试文件\\查重结果.txt"});
    }

    /**
     * 测试结果输出文件路径为null的情况
     */
    @Test
    public void testForResultNull(){
        Main.main(new String[]{"D:\\测试文件\\orig.txt","D:\\测试文件\\orig_0.8_add.txt",null});
    }


    /**
     * 测试路径不存在的情况
     */
    @Test
    public void testForNotExistFile(){
        Main.main(new String[]{"D:\\测试文件\\orig.txt","D:\\测试文件\\不存在.txt","D:\\测试文件\\查重结果.txt",});
    }


    /**
     * 测试对比orig_0.8_add.txt
     */
    @Test
    public void testForAdd(){
        Main.main1("D:\\测试文件\\orig.txt","D:\\测试文件\\orig_0.8_add.txt","D:\\测试文件\\查重结果.txt");
    }


    /**
     * 测试对比orig_0.8_del.txt
     */
    @Test
    public void testForDel(){
        Main.main1("D:\\测试文件\\orig.txt","D:\\测试文件\\orig_0.8_del.txt","D:\\测试文件\\查重结果.txt");
    }

    /**
     * 测试对比orig_0.8_dis_1.txt.txt
     */
    @Test
    public void testForDis1(){
        Main.main1("D:\\测试文件\\orig.txt","D:\\测试文件\\orig_0.8_dis_1.txt","D:\\测试文件\\查重结果.txt");
    }


    /**
     * 测试对比orig_0.8_dis_10.txt
     */
    @Test
    public void testForAdd10(){
        Main.main1("D:\\测试文件\\orig.txt","D:\\测试文件\\orig_0.8_dis_10.txt","D:\\测试文件\\查重结果.txt");
    }


    /**
     * 测试对比orig_0.8_dis_15.txt
     */
    @Test
    public void testForDis15(){
        Main.main1("D:\\测试文件\\orig.txt","D:\\测试文件\\orig_0.8_dis_15.txt","D:\\测试文件\\查重结果.txt");
    }
}
