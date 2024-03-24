package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileController {

    @GetMapping("/upload")
    public Map<Integer, Integer> upload(@RequestParam("file")MultipartFile file) throws IOException {

        Map<Integer, Integer> map = new HashMap<>();
        InputStream inputStream = file.getInputStream();
        List<String> line = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))
                .lines().collect(Collectors.toList());
        for (String s : line) {
            String[] splited = s.split("\\s+");
            int n = splited.length;
            if ((n % 2) == 0) {
                // even
            } else {
                // odd
                map.put(line.indexOf(s) + 1, n);
            }
        }
        return map;
    }

}
