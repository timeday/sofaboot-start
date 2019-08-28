/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sofaboot.sofa.controller;


import com.sofaboot.sofa.common.dal.tables.Student;
import com.sofaboot.sofa.facade.NewsReadService;
import com.sofaboot.sofa.facade.NewsWriteService;
import com.alipay.sofa.runtime.api.annotation.SofaReference;
import org.springframework.web.bind.annotation.*;


import java.util.*;


@RestController
@RequestMapping("/api/student")
public class SampleRestController {

    private static int cnt = 0;
    @SofaReference
    private NewsReadService  newReadService;

    @SofaReference
    private NewsWriteService newWriteService;

    @RequestMapping("/json")
    public String sampleController() {
        return "pong";
    }

    @RequestMapping("/newReadService")
    @ResponseBody
    public List<Student> readService() {
        return newReadService.readAll();
    }

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Student> queryAll() {
        List<Student> list = new ArrayList<Student>();
        list = newReadService.readAll();
        return list;
    }

    @RequestMapping("/selectList")
    @ResponseBody
    public List<Student> selectList() {
        return newReadService.selectAll();
    }
}