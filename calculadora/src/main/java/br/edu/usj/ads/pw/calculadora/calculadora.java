package br.edu.usj.ads.pw.calculadora;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class calculadora {

    @PostMapping(value="calcular")
    public ModelAndView postCalcular(@RequestParam String operando1, @RequestParam String operando2, @RequestParam String operador)
    {
        
        Double operando1Double = Double.valueOf(operando1);
        Double operando2Double = Double.valueOf(operando2);
        Double resultadoOperacao = 0.0;
                      
       
        if (operador.equals("+")){
            // soma
            resultadoOperacao = operando1Double + operando2Double;
         
        }
        else if (operador.equals("-")){
            //subtrair
            resultadoOperacao = operando1Double - operando2Double;
        }
        else if (operador.equals("*")){
            //multiplicar
            resultadoOperacao = operando1Double * operando2Double;
        }
        else if (operador.equals("/")){
            //dividir
            resultadoOperacao = operando1Double / operando2Double;
        }

           
        String operacao = String.valueOf(operando1 + operador + operando2 + " = " + resultadoOperacao);
          
       
        ModelAndView modelAndView = new ModelAndView("resultado");
        modelAndView.addObject("texto_resultado", operacao);
        return modelAndView;
    }
    
    
}
