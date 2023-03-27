package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RentController {

    @GetMapping("/available-rents")
    public ResponseEntity<String> showAvailablesRents() {
        return ResponseEntity.ok("Rents Availables");
    }
}
