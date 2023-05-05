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
    public void testToStringStartsAndEndsWithNewLine() {
    Job job6 = new Job("CEO", new Employer("Google"), new Location("CA"),
            new PositionType("boss"), new CoreCompetency("leadership"));
    char firstChar = job6.toString().charAt(0);
    char lastChar = job6.toString().charAt(job6.toString().length()-1);
    assertEquals(firstChar, '\n');
    assertEquals(lastChar, '\n');
}

// define a test called testToStringContainsCorrectLabelsAndData
@Test
    public void testToStringContainsCorrectLabelsAndData() {
    Job job7 = new Job("A", new Employer("B"), new Location("C"),
            new PositionType("D"), new CoreCompetency("E"));
   String jobString = job7.toString();
   assertEquals("\nID: " + job7.getId() + "\nName: " + job7.getName() + "\nEmployer: " +
           job7.getEmployer() + "\nLocation: " + job7.getLocation() + "\nPosition Type: " +
           job7.getPositionType() + "\nCore Competency: " + job7.getCoreCompetency() + "\n", jobString);
}

// define a test called testToStringHandlesEmptyField
 @Test
    public void testToStringHandlesEmptyField() {
    Job job8 = new Job("Coach", new Employer("Sportsball Team"),
            new Location(""), new PositionType("coach"), new CoreCompetency("coaching"));
     String jobString = job8.toString();
    assertEquals("\nID: " + job8.getId() + "\nName: " + job8.getName() + "\nEmployer: " +
            job8.getEmployer() + "\nLocation: Data not available" + "\nPosition Type: " +
            job8.getPositionType() + "\nCore Competency: " + job8.getCoreCompetency() + "\n", jobString);
 }

}
