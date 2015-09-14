package demo.services;

import demo.domain.Program;
import demo.repositories.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by sanjidagafur on 10/09/2015.
 */
@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

//    @Autowired
//    CounterService counterService;
//
//    @Autowired
//    GaugeService gaugeService;

    public ProgramService() {
    }

    public Program createProgram(Program program) {
        System.out.println("creating program");
        return programRepository.save(program);
    }

    public Program getProgram(long id) {
        return programRepository.findOne(id);
    }

    public Page<Program> getAllPageOfPrograms(Integer page, Integer size) {
        Page pageOfPrograms = programRepository.findAll(new PageRequest(page, size));
        return pageOfPrograms;
    }

    public List<Program> getAllPrograms(){
        Iterator<Program> result = programRepository.findAll().iterator();
        List<Program> programs = new LinkedList<Program>();
        while(result.hasNext()){
            programs.add(result.next());
        }

        return programs;
    }
}
