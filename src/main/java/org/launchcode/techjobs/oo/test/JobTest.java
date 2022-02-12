package org.launchcode.techjobs.oo.test;

//import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job test_job = new Job();
        Job test_job2 = new Job();
        assertNotEquals( test_job.getId(), test_job2.getId());
    }




    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(test_job.getName() instanceof String);
        assertEquals("Product tester", test_job.getName());

        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("ACME", test_job.getEmployer().getValue() );

        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Desert",test_job.getLocation().getValue());

        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertEquals("Quality control",test_job.getPositionType().getValue());

        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence",test_job.getCoreCompetency().getValue());


    }

    @Test
    public void testJobsForEquality() {
        Job test_Job =  new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_Job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_Job.equals(test_Job2));
    }




}
