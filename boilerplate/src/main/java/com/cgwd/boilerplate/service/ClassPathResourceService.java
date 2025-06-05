/*
 *******************************************************************************
 * Project: Boilerplate
 *
 * Author: Collin Turner
 * =============================================================================
 * (c) Copyright 2025 Code Green Web Design All rights reserved.
 *******************************************************************************
*/

package com.cgwd.boilerplate.service;

import java.nio.file.Files;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.cgwd.boilerplate.model.Result;

@Service
public class ClassPathResourceService extends BaseService {

    public Result<String> getFileContents(String filePath) {
        Result<String> result = new Result<>();

        try {
             // Load the resource from the resources/static folder
            ClassPathResource resource = new ClassPathResource(filePath);
            String fileContent = Files.readString(resource.getFile().toPath());
            // set the file content in the result data
            result.setData(fileContent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
