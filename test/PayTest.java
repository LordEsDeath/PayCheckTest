/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pupil
 */
public class PayTest {
    
    
    


    @Test
    public void testPayYear() {
        System.out.println("PayYear");
        double a = 750.0; 
        Pay instance = new Pay();
        double[] expResult = {47.6,12.0,690.4};
        double[] result = instance.PayYear(a);
        assertArrayEquals(expResult, result, 0.01);
        
    }
    
}
