package demo.controller;

import demo.domain.Program;
import demo.domain.Programs;
import demo.services.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.Valid;

/**
 * Created by sanjidagafur on 10/09/2015.
 */
@ComponentScan
@Controller
public class ProgramController  extends WebMvcConfigurerAdapter {

    @Autowired
    private ProgramService programService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/programentryconfirmation").setViewName("programentryconfirmation");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @RequestMapping(value="/programentry", method= RequestMethod.GET)
    public String showForm(Program program) {
        return "programentry";
    }

    @RequestMapping(value="/programentry", method=RequestMethod.POST)
    public String updateProgram(@Valid Program program, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "programentry";
        }
        try{
            System.out.println("program => "+program);

            this.programService.createProgram(program);
            System.out.println("programService.getProgram(program.getId()) => "+programService.getProgram(program.getId()));
            return "redirect:/programentryconfirmation";
        } catch (Exception ex) {
            bindingResult.addError(new ObjectError("CreationError", "Failed to create program"));

            return "programentry";
        }

    }

    @RequestMapping(value="/programs", method= RequestMethod.GET)
    public String showProgramList(Programs programs) {

        programs.setPrograms(programService.getAllPrograms());

        return "programs";
    }

}
