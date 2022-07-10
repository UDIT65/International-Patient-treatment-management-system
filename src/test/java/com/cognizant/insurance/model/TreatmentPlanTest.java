package com.cognizant.insurance.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 * 
 * 		the class tests all the setters and getters and constructors
 * 		for the Treatment Plan  
 *
 */
public class TreatmentPlanTest {

	TreatmentPlan treatmentPlan = new TreatmentPlan();

	@Test
	public void test_SetId() {
		treatmentPlan.setId(10);
		assertEquals(10, treatmentPlan.getId());
	}

	@Test
	public void test_GetId() {
		treatmentPlan.setId(10);
		assertEquals(10, treatmentPlan.getId());
	}

	@Test
	public void test_SetTestDetails() {
		treatmentPlan.setTestDetails("Urology");
		assertEquals("Urology", treatmentPlan.getTestDetails());
	}

	@Test
	public void test_GetTestDetails() {
		treatmentPlan.setTestDetails("Urology");
		assertEquals("Urology", treatmentPlan.getTestDetails());
	}

	@Test
	public void test_SetPackageName() {
		treatmentPlan.setPackageName("Package 1");
		assertEquals("Package 1", treatmentPlan.getPackageName());
	}

	@Test
	public void test_GetPackageName() {
		treatmentPlan.setPackageName("Package 1");
		assertEquals("Package 1", treatmentPlan.getPackageName());
	}

	@Test
	public void test_SetSpecialist() {
		treatmentPlan.setSpecialist("Orthopeadics");
		assertEquals("Orthopeadics", treatmentPlan.getSpecialist());
	}

	@Test
	public void test_GetSpecialist() {
		treatmentPlan.setSpecialist("Orthopeadics");
		assertEquals("Orthopeadics", treatmentPlan.getSpecialist());
	}

	@Test
	public void test_SetStatus() {
		treatmentPlan.setStatus("In progress");
		assertEquals("In progress", treatmentPlan.getStatus());
	}

	@Test
	public void test_GetStatus() {
		treatmentPlan.setStatus("In progress");
		assertEquals("In progress", treatmentPlan.getStatus());
	}

	@Test
	public void test_SetTreatmentCommencementDate() {
		treatmentPlan.setTreatmentCommencementDate("20/06/2022");
		assertEquals("20/06/2022", treatmentPlan.getTreatmentCommencementDate());
	}

	@Test
	public void test_GetTreatmentCommencementDate() {
		treatmentPlan.setTreatmentCommencementDate("20/06/2022");
		assertEquals("20/06/2022", treatmentPlan.getTreatmentCommencementDate());
	}

	@Test
	public void test_SetTreatmentEndDate() {
		treatmentPlan.setTreatmentEndDate("20/07/2022");
		assertEquals("20/07/2022", treatmentPlan.getTreatmentEndDate());
	}

	@Test
	public void test_GetTreatmentEndDate() {
		treatmentPlan.setTreatmentEndDate("20/07/2022");
		assertEquals("20/07/2022", treatmentPlan.getTreatmentEndDate());
	}

}
