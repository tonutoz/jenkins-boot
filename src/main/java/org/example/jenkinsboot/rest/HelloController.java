package org.example.jenkinsboot.rest;

import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/hello")
@RequiredArgsConstructor
public class HelloController {

  @GetMapping
  public ResponseEntity<?> get() {

    List<String> list = Arrays.stream("1,2,3,4,5,6".split(",")).peek(log::info).toList();

    return ResponseEntity.ok(list);
  }


}
