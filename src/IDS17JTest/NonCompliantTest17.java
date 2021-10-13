package IDS17JTest;
import org.junit.Test;

import IDS17J.NonCompliant17;

import static org.junit.Assert.*;

public class NonCompliantTest17 {
    NonCompliant17 object = new NonCompliant17();

    @Test
    public void maliciousInput(){
        String in = "evil.xml";
        String out = object.resolveEntity("123", in);
        assertEquals("",out);
    }

    @Test
    public void HonestInput(){
        String in = "file:/Users/onlinestore/good.xml";
        String out = object.resolveEntity("123", in);
        assertEquals(in,out);
    }

    @Test
    public void GarbageInput(){
        String in = "43ny7n54ny9348cny99";
        String out = object.resolveEntity("123", in);
        assertEquals("",out);
    }

}
