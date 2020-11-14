package com.agile.toolbox.controller;

import com.agile.toolbox.dto.Response;
import com.agile.toolbox.dto.Sprint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class SprintController {

    @GetMapping("/sprints")
    public Response<Sprint> sprints() {
        return new Response<>(Arrays.asList(new Sprint(), new Sprint()));
    }

}
