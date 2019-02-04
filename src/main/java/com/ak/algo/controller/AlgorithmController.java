package com.ak.algo.controller;

import com.ak.algo.service.AlgorithmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlgorithmController {
    @Autowired
    private AlgorithmService algorithmService;

    @GetMapping("/getLexicographicalyNext")
    public String  getLexographicallyNext(@RequestParam("input") String input){
        return algorithmService.getLexographicallyNext(input);
    }
}
