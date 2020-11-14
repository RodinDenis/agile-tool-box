package com.agile.toolbox.controller;

import com.agile.toolbox.dto.Backlog;
import com.agile.toolbox.dto.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class BacklogController {

    @GetMapping("/backlogs")
    public Response<Backlog> backlogs() {
        return new Response<>(Arrays.asList(new Backlog(), new Backlog()));
    }

}
