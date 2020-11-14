package com.agile.toolbox.controller;

import com.agile.toolbox.dto.Project;
import com.agile.toolbox.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class ProjectController {

    @GetMapping("/projects")
    public Response<Project> projects() {
        return new Response<>(Arrays.asList(new Project(), new Project()));
    }

}
