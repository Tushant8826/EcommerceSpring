package org.example.ecommercespring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    @GetMapping
    public String getCategories() {
        return "Electronics";
    }

    @PostMapping
    public String getPostCategories() {
        return "Post Electronics";
    }
}
