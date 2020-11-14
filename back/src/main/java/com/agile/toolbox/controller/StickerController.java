package com.agile.toolbox.controller;

import com.agile.toolbox.dto.Response;
import com.agile.toolbox.dto.Sticker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class StickerController {

    @GetMapping("/stickers")
    public Response<Sticker> backlogs() {
        return new Response<>(Arrays.asList(new Sticker(), new Sticker()));
    }
}
