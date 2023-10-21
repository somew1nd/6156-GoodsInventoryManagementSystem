package top.faquan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.faquan.domainORpojo.client;
import top.faquan.service.bookService;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class client_controller{

    @Autowired
    private bookService bookService;

    @PostMapping("/1")
    public boolean saveAll(@RequestBody client client) {
        return bookService.saveAll(client);
    }

    @PostMapping
    public boolean save(@RequestBody client client) {
        return bookService.save(client);
    }

    @DeleteMapping("/{username}")
    public boolean delete(@PathVariable String username) {
        return bookService.delete(username);
    }

    @GetMapping("/{username}")
    public client selectByUsername(@PathVariable String username) {
        return bookService.selectByUsername(username);
    }

    @GetMapping()
    public List<client> selectAll() {
        return bookService.selectAll();
    }

    @GetMapping("/{username}/{password}") //$似乎不行 会认为是username的一部分
    public client getByNameAndPassword(@PathVariable String username, @PathVariable String password) {
        return bookService.getByNameAndPassword(username,password);
    }

}
