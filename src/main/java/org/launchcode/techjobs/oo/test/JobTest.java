package org.launchcode.techjobs.oo.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
// define a test called testSettingJobId
@Test
    public void testSettingJobId() {
    Job job1 = new Job();
    Job job2 = new Job();
    assertNotEquals(job1.getId(), job2.getId());
}

// define a test called testJobConstructorSetsAllFields
@Test
    public void testJobConstructorSetsAllFields() {
    Job job3 = new Job("Product tester", new Employer("ACME"),
            new Location("Desert"), new PositionType("Quality control"),
            new CoreCompetency("Persistence"));
    assertEquals("Product tester", job3.getName());
    assertEquals("ACME", job3.getEmployer().getValue());
    assertEquals("Desert", job3.getLocation().getValue());
    assertEquals("Quality control", job3.getPositionType().getValue());
    assertEquals("Persistence", job3.getCoreCompetency().getValue());
    assertTrue(job3 instanceof Job);
    assertTrue(job3.getEmployer() instanceof Employer);
    assertTrue(job3.getLocation() instanceof Location);
    assertTrue(job3.getPositionType() instanceof PositionType);
    assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
}
// define a test called testJobsForEquality
@Test
    public void testJobsForEquality() {
    Job job4 = new Job("Chief Operations Officer", new Employer("United Federation of Planets Starfleet"),
            new Location("USS Enterprise"), new PositionType("Data Scientist"),
            new CoreCompetency("emotional intelligence"));
    Job job5 = new Job("Chief Operations Officer", new Employer("United Federation of Planets Starfleet"),
            new Location("USS Enterprise"), new PositionType("Data Scientist"),
            new CoreCompetency("emotional intelligence"));
    assertFalse(job4.getId() == job5.getId());
}
// define a test called testToStringStartsAndEndsWithNewLine
@Test
    public void testToStringStartsAndEndsWithNewLine(){
    
}

// define a test called testToStringContainsCorrectLabelsAndData


// define a test called testToStringHandlesEmptyField
}
