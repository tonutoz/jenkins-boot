package org.example.jenkinsboot.master;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/zzzzzzzzzzzz")
public class RestController {

    @GetMapping("/zzzzzzzzzzzzzzzz")
    public ResponseEntity<?> getMethod() {
      return ResponseEntity.ok("zzzzzzzzzzzzzz");
    }

}
