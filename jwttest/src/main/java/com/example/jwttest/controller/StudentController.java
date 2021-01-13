package com.example.jwttest.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.jwttest.entity.Student;
import com.example.jwttest.result.ResultBuilder;
import com.example.jwttest.result.StatusCode;
import com.example.jwttest.service.StudentService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "StudentController")
@RequestMapping(value = "/api/student")
public class StudentController {
    @Autowired
    private StudentService stuservice;
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @ApiOperation(value = "获取全部学生",notes = "获取全部学生notes")
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public ResultBuilder<List<Student>> list(){
        List<Student> stulist = stuservice.selectAll();
        return new ResultBuilder<List<Student>>(stulist,StatusCode.SUCCESS);
    }

//    @ApiOperation(value = "获取学生信息",notes = "根据id获取学生信息")
//    @ApiImplicitParam(name = "id", value = "学生ID", required = true, dataType = "Integer")
    @RequestMapping(value = "/list/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResultBuilder<Student> selectById(@PathVariable Integer id){
        Student student = stuservice.selectById(id);
        return new ResultBuilder<Student>(student,StatusCode.SUCCESS);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public ResultBuilder<String> add(@RequestBody String requestJson){
        JSONObject jsonObject = JSON.parseObject(requestJson);
        Student student = new Student();
        student.setId(jsonObject.getInteger("id"));
        student.setName(jsonObject.getString("name"));
        student.setAge(jsonObject.getInteger("age"));
        student.setSex(jsonObject.getString("sex"));
        student.setAddress(jsonObject.getString("address"));
        student.setHeaderimg(jsonObject.getString("headerimg"));
        Boolean success = stuservice.add(student);
        if(success){
            return new ResultBuilder<String>(StatusCode.SUCCESS);
        }
        return new ResultBuilder<String>(500,"添加失败");
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    @ResponseBody
    public ResultBuilder<String> update(@RequestBody String requestJson){
        JSONObject jsonObject = JSON.parseObject(requestJson);
        Student student = new Student();
        student.setId(jsonObject.getInteger("id"));
        student.setName(jsonObject.getString("name"));
        student.setAge(jsonObject.getInteger("age"));
        student.setSex(jsonObject.getString("sex"));
        logger.error(jsonObject.getString("sex"));
        student.setAddress(jsonObject.getString("address"));
        student.setHeaderimg(jsonObject.getString("headerimg"));
        Boolean success = stuservice.update(student);
        if(success){
            return new ResultBuilder<String>(StatusCode.SUCCESS);
        }
        return new ResultBuilder<String>(500,"更新失败");
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public ResultBuilder<String> delete(@PathVariable Integer id){
        Boolean success = stuservice.delete(id);
        if(success){
            return new ResultBuilder<String>(StatusCode.SUCCESS);
        }
        return new ResultBuilder<String>(500,"删除失败");
    }

}
