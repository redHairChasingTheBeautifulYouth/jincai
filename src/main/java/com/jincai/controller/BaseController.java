package com.jincai.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.jincai.model.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

/**
 * 基础数据模块查询
 *
 * @author LiuBing
 * @date 2018/9/12 10:23
 */
@RestController
@Api(value = "数据接口", description = "数据接口")
@RequestMapping("/base")
public class BaseController {

    @ApiOperation(value = "得到数据")
    @PostMapping("/getData")
    public String getData(@RequestBody ReturnResult returnResult) throws Exception {
        String date = "2018-10-31";
        Double sp = 3.19;
        Data data = returnResult.getData();
        List<Schedules> schedules = data.getSchedules();
        List<List<Game>> list = null;
        for (Schedules schedule : schedules) {
            if (Objects.equals(schedule.getDate() ,date)) {
                list = schedule.getList();
            }
        }
        List<ExcelModel> models = new ArrayList<>();
        for (int i=0;i<list.size();i++) {
            ExcelModel excelModel = new ExcelModel();
            if (list.get(i).size() < 5) {
                continue;
            }
            for (int j=0;j<list.get(i).size();j++) {
                Game game = list.get(i).get(j);
                Play play = game.getPlay();
                String[] spTypeGg = play.getSpTypeGg();
                String id = play.getId();
                int length = id.length();
                String value=id.substring(length-3,length);
                if (Objects.equals(game.getType() ,"0")) {
                    excelModel.setName(value);
                    excelModel.setWin(spTypeGg[0]);
                    excelModel.setLose(spTypeGg[2]);
                }else if (Objects.equals(game.getType() ,"1")) {
                    excelModel.setLetWin(spTypeGg[0]);
                    excelModel.setLetLose(spTypeGg[2]);
                }else {
                    continue;
                }
            }
            models.add(excelModel);
        }
        List<ExcelModel> cloneModels = Lists.newArrayList();
        for (ExcelModel excelModel : models) {
            cloneModels.add((ExcelModel) excelModel.clone());
        }

        int i=1;
        Map<String ,String> targetMap = Maps.newHashMap();
        Iterator<ExcelModel> iterator = models.iterator();
        while (iterator.hasNext()) {
            ExcelModel next = iterator.next();
            for (ExcelModel cloneModel : cloneModels) {
                Field[] fields = next.getClass().getDeclaredFields();
                for (Field nextField : fields) {
                    if (com.google.common.base.Objects.equal(nextField.getName() ,"name")) {
                        continue;
                    }
                    Method nextMethod = next.getClass().getMethod("get"+nextField.getName().substring(0,1).toUpperCase()+nextField.getName().substring(1,nextField.getName().length()));
                    String nextValue = (String) nextMethod.invoke(next ,null);
                    if (Double.valueOf(nextValue) > 2.2 || Double.valueOf(nextValue) < 1.2) {
                        continue;
                    }
                    for (Field cloneField : fields) {
                        if (com.google.common.base.Objects.equal(cloneField.getName() ,"name")) {
                            continue;
                        }
                        Method cloneMethod = next.getClass().getMethod("get"+cloneField.getName().substring(0,1).toUpperCase()+cloneField.getName().substring(1,cloneField.getName().length()));
                        String cloneValue = (String) cloneMethod.invoke(cloneModel ,null);
                        if (Double.valueOf(cloneValue) > 2.2 || Double.valueOf(cloneValue) < 1.2) {
                            continue;
                        }
                        Double value = Double.valueOf(nextValue) * Double.valueOf(cloneValue);
                        if (value >= (sp - 0.005)  && value <= (sp + 0.005)) {
                            targetMap.put(String.valueOf(i) ,next.getName()+"_"+nextField.getName()+"###"+cloneModel.getName()+"_"+cloneField.getName());
                            i++;
                        }
                    }
                }
            }
        }
        Set<String> strings = targetMap.keySet();
        Set<String> set1 = Sets.newHashSet();
        for (String s : strings) {
            String tar = targetMap.get(s);
            set1.add(tar);
        }
        Iterator<String> iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            String v = iterator1.next();
            String[] strs = v.split("###");
            String tar1 = strs[1]+"###"+strs[0];
            if (set1.contains(tar1)) {
                iterator1.remove();
            }
        }
        System.out.println(set1);
        System.out.println(set1.size());
        for (String str : set1) {
            String[] split = str.split("###");
            String[] s = split[0].split("_");
            String[] s1 = split[1].split("_");
            if (!s[0].equals(s1[0])) {
                System.out.println(split[0]);
                System.out.println(split[1]);
                System.out.println("--------------------------------------------------");
            }
        }


        return "";
    }
}
