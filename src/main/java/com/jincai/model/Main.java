/*
package com.jincai.model;
*/
/*
 *一句话描述该类作用:【】
 *@Author:LB
 *
 *//*


import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import json.Json;
import model.ExcelModel;
import model.ReturnResult;
import util.ExcelUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] arges) throws Exception {

//        //ReturnResult returnResult = (ReturnResult) JSONObject.parse(Json.json);
//
//
//        String encoding = "UTF-8";
//        File file = new File("F:\\jincai.txt");
//        Long filelength = file.length();
//        byte[] filecontent = new byte[filelength.intValue()];
//        try {
//            FileInputStream in = new FileInputStream(file);
//            in.read(filecontent);
//            in.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        String txt = new String(filecontent, encoding);
//        JSONObject jsonObject = JSONObject.parseObject(txt);
//        //ReturnResult returnResult = JSONObject.parseObject(txt ,ReturnResult.class);
//        Double sp = 3.33;
//        Map<String ,String> targetMap = Maps.newHashMap();
//        //File file = new File("F:\\1111.xls");
//        int i=1;
//        List<ExcelModel> models = ExcelUtils.getDataByExcel(file ,ExcelModel.class);
//        List<ExcelModel> cloneModels = Lists.newArrayList();
//        for (ExcelModel excelModel : models) {
//            cloneModels.add((ExcelModel) excelModel.clone());
//        }
//        Iterator<ExcelModel> iterator = models.iterator();
//        while (iterator.hasNext()) {
//            ExcelModel next = iterator.next();
//            for (ExcelModel cloneModel : cloneModels) {
//                Field[] fields = next.getClass().getDeclaredFields();
//                for (Field nextField : fields) {
//                    if (Objects.equal(nextField.getName() ,"name")) {
//                        continue;
//                    }
//                    Method nextMethod = next.getClass().getMethod("get"+nextField.getName().substring(0,1).toUpperCase()+nextField.getName().substring(1,nextField.getName().length()));
//                    String nextValue = (String) nextMethod.invoke(next ,null);
//                    if (Double.valueOf(nextValue) > 2.2 || Double.valueOf(nextValue) < 1.2) {
//                        continue;
//                    }
//                    for (Field cloneField : fields) {
//                        if (Objects.equal(cloneField.getName() ,"name")) {
//                            continue;
//                        }
//                        Method cloneMethod = next.getClass().getMethod("get"+cloneField.getName().substring(0,1).toUpperCase()+cloneField.getName().substring(1,cloneField.getName().length()));
//                        String cloneValue = (String) cloneMethod.invoke(cloneModel ,null);
//                        if (Double.valueOf(cloneValue) > 2.2 || Double.valueOf(cloneValue) < 1.2) {
//                            continue;
//                        }
//                        Double value = Double.valueOf(nextValue) * Double.valueOf(cloneValue);
//                        if (value >= (sp - 0.005)  && value <= (sp + 0.005)) {
//                            targetMap.put(String.valueOf(i) ,next.getName()+"_"+nextField.getName()+"###"+cloneModel.getName()+"_"+cloneField.getName());
//                            i++;
//                        }
//                    }
//                }
//            }
//        }
//        Set<String> strings = targetMap.keySet();
//        Set<String> set1 = Sets.newHashSet();
//        for (String s : strings) {
//            String tar = targetMap.get(s);
//            set1.add(tar);
//        }
//        Iterator<String> iterator1 = set1.iterator();
//        while (iterator1.hasNext()) {
//            String v = iterator1.next();
//            String[] strs = v.split("###");
//            String tar1 = strs[1]+"###"+strs[0];
//            if (set1.contains(tar1)) {
//                iterator1.remove();
//            }
//        }
//        System.out.println(set1);
//        System.out.println(set1.size());
//        for (String str : set1) {
//            String[] split = str.split("###");
//            String[] s = split[0].split("_");
//            String[] s1 = split[1].split("_");
//            if (!s[0].equals(s1[0])) {
//                System.out.println(split[0]);
//                System.out.println(split[1]);
//                System.out.println("--------------------------------------------------");
//            }
//        }
//    }

}
*/
