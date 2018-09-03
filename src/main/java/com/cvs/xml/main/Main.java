package com.cvs.xml.main;

import javax.batch.runtime.JobExecution;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main {
	public static void main(String[] args) throws Exception{

		String[] springConfig = {"personne.xml"}; // je suis sure qu'elle soit juste
		
		//créer une application context
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		// lancer le job
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		
		// créer le job
		Job job = (Job) context.getBean("personne");
		
		//Execution de job
		JobExecution execution = (JobExecution) jobLauncher.run(job, new JobParameters()); // erreur ici
		System.out.println("Exit Status : " + execution.getBatchStatus());
		
		
	}
}
