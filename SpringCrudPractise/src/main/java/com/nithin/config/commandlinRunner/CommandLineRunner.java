package com.nithin.config.commandlinRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nithin.config.Dao.EmployeeRepository;
import com.nithin.config.Model.Employye;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	 @Autowired
	 private EmployeeRepository reopo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
       System.out.println("I am done... lets start coding round big round");
      
     ArrayList<Employye> al = new ArrayList<Employye>();
     
    al.add(new Employye("A",12));
    al.add(new Employye("B",58));
    al.add(new Employye("H",36));
    al.add(new Employye("E",36));
    al.add(new Employye("G",36));
    
    reopo.saveAll(al);
    
	/*
	 * Optional<Employye> opt = reopo.findById(3);
	 * System.out.println("after optional class"); if(opt.isPresent()) {
	 * System.out.println("inside the optional present class");
	 * System.out.println(opt.get()); }
	 * 
	 * System.out.println("after optional class"); Boolean sid =
	 * reopo.existsById(2); Boolean sid2 = reopo.existsById(5);
	 * System.out.println("ture is"+sid+"falsse is"+sid2);
	 */
    
    //reopo.findAll().forEach(e->System.out.println(e+"inside findall"));
    //reopo.findAllById(Arrays.asList(2,4)).forEach(e->System.out.println(e+"findbyId2,4"));
    
    
    //count is used to count the no of rows in database table
    
    System.out.println(reopo.count());
	}

}
