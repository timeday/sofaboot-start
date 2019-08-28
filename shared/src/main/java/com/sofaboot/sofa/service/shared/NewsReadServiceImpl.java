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
package com.sofaboot.sofa.service.shared;

import com.sofaboot.sofa.common.dal.mapper.StudentMapper;
import com.sofaboot.sofa.common.dal.tables.Student;
import com.sofaboot.sofa.facade.NewsReadService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class NewsReadServiceImpl implements NewsReadService<Student> {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> readAll()  {
        try {
            return studentMapper.findAll();
        } catch (Throwable ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}