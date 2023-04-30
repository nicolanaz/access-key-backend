package com.example.accesskeybackend.template.controller;

import com.example.accesskeybackend.template.service.CheckApiV6SupportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/web/checkIpv6Support")
public class CheckApiV6SupportController {
    private CheckApiV6SupportService service;

    public CheckApiV6SupportController(CheckApiV6SupportService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Boolean> checkUrl(@RequestParam("siteUrl") String siteUrl) {
        boolean ipV6Support = service.supportIpV6(siteUrl);
        return ResponseEntity.ok(ipV6Support);
    }
}
