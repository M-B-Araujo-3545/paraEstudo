package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/")
public class MeuController {

   @GetMapping("/home")
    public String inicio(){
       return "/home";
   }

   @GetMapping("/clienteDados/cliente")
    public String cadastrar(){
       return "/clienteDados/cliente";
   }

   @GetMapping("/produtoDados/produto")
    public String dadosProduto(){
       return "/produtoDados/produto";
   }


}
