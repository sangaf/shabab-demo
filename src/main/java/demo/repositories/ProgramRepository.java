package demo.repositories;

import demo.domain.Program;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by sanjidagafur on 10/09/2015.
 */
public interface ProgramRepository extends PagingAndSortingRepository<Program, Long> {
    Program findProgramByProgramName(String programName);
    Page findAll(Pageable pageable);
}
