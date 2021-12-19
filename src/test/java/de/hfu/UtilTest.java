package de.hfu;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilTest {

	@Test
    public void istErstesHalbjahrTest()
    {
        assertTrue(Util.istErstesHalbjahr(1));
        assertTrue(Util.istErstesHalbjahr(2));
        assertTrue(Util.istErstesHalbjahr(6));
        assertFalse(Util.istErstesHalbjahr(7));
        assertFalse(Util.istErstesHalbjahr(10));
        assertFalse(Util.istErstesHalbjahr(12));
        try {
        	Util.istErstesHalbjahr(0);
        } catch(Exception e) {
        	assertEquals(e.getClass(), new IllegalArgumentException().getClass() );
        }
        try {
        	Util.istErstesHalbjahr(13);
        } catch(Exception e) {
        	assertEquals(e.getClass(), new IllegalArgumentException().getClass() );
        }
    }

}
