package org.wzguang.papercheck;

import org.wzguang.papercheck.component.EnterNullException;
import org.wzguang.papercheck.pojo.Paper;
import org.wzguang.papercheck.util.CalculatorUtil;
import org.wzguang.papercheck.util.FileUtil;

import java.util.Scanner;

import static org.wzguang.papercheck.util.FileUtil.getPercentFormat;



public class Main {
    public static void main(String[] args) {
        String [] arr= new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("输入源文件地址：");
        arr[0] = sc.next();
        System.out.println("输入对比文件地址：");
        arr[1] = sc.next();
        System.out.println("输入输出文件地址：");
        arr[2] = sc.next();
        Main.main1(arr[0],arr[1],arr[2]);
    }
    public static void main1(String A,String B,String C) {
        String result;
        long before = System.currentTimeMillis();
        try {
            if (A == null){
                throw new EnterNullException("输入源文件的地址为空，请重新输入！");
            } else if (B == null) {
                throw new EnterNullException("输入对比文件的地址为空，请重新输入！");
            }else if (C == null){
                throw new EnterNullException("输出文件地址的为空，请重新输入！");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }
        Paper originalText = FileUtil.readFromFile(A);
        Paper modifiedText = FileUtil.readFromFile(B);
        CalculatorUtil.calculate(originalText, modifiedText);
        result = getPercentFormat(modifiedText.getRepetitionRate()) +"\n";
        FileUtil.writeInFile(C, result);
    }
}
