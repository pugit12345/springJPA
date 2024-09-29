package com.spring_jpa.controller;

import com.spring_jpa.Entity.Emp;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/base")
public class TestController {

@RequestMapping("/my-name")

    public String GetName()
    {
        return "Prakash Kumar";
    }

    @GetMapping(value = {"/stu","/pku","/gets"})
    public Emp getEmp()
    {
        Emp e = new Emp(101,"prakash kumar","chapra","tinku.sjce@","phone num mismatch");
        return e;
    }

    @PostMapping(value="/api/create")
    @ResponseStatus(value= HttpStatus.ACCEPTED)
    public Emp create(@RequestBody Emp e)
    {
        System.out.println(e.toString());

        return e;

    }

    @PutMapping(value = "/api/update/{id}")
    public ResponseEntity<Emp> update(@PathVariable int id, @RequestBody Emp e)
    {
        e.setId(id);
        System.out.println(e.toString());
        return ResponseEntity.ok(e);
    }

    @DeleteMapping(value="/api/delete/{id}")
    public ResponseEntity<String> deleteMapping(@PathVariable int id)
    {
        System.out.println("Praksh delete mapping +" + id);

        return ResponseEntity.ok("prakash bood deleted");
    }

    @GetMapping(value = {"/checkPath/{id}/{empname}"})
    public ResponseEntity<Emp> checkEmp(@PathVariable long id, @PathVariable("empname") String name )
    {
        Emp e = new Emp();
        e.setId(id);
        e.setName(name);
        return ResponseEntity.ok(e);
    }

    @GetMapping("/queryparam")
    public ResponseEntity<Emp> queryParam(@RequestParam long id, @RequestParam String name, @RequestParam(name="desc")String desc1)
    {
        Emp e = new Emp();
        e.setName(name);
        e.setId(id);
        e.setAddress((desc1));;

        return ResponseEntity.ok(e);
    }
}
