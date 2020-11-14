package com.agile.toolbox.controller;

import com.agile.toolbox.dto.Response;
import com.agile.toolbox.dto.Status;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class StatusController {
    @GetMapping("/statuses")
    public Response<Status> backlogs() {
        return new Response<Status>(Arrays.asList(new Status(), new Status()));
    }

}
