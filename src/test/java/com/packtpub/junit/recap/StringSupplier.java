package com.packtpub.junit.recap;

import java.util.ArrayList;
import java.util.List;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

public class StringSupplier extends ParameterSupplier {

	@Override
	public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
		
		List<PotentialAssignment> list = new ArrayList<PotentialAssignment>(); 
		list.add(PotentialAssignment.forValue("String1", "Good"));
		list.add(PotentialAssignment.forValue("String2", "Morning"));
		return list;
	}	
}
