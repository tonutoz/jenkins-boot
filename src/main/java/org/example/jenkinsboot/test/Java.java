package org.example.jenkinsboot.test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public class Java {

    public ResponseEntity<?> getData(final String z) {
        return ResponseEntity.ok("zzzzzzzzzzzz");
    }

}
