/*
 * Copyright (c) 2002-2023 Manorrock.com. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice,
 *      this list of conditions and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *   3. Neither the name of the copyright holder nor the names of its
 *      contributors may be used to endorse or promote products derived from
 *      this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package cloud.piranha.smart.webapp;

import java.util.Enumeration;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The JUnit tests for the SmartFilterConfig class.
 * 
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class SmartFilterConfigTest {
    
    /**
     * Test getFilterName method.
     */
    @Test
    public void testGetFilterName() {
        Properties properties = new Properties();
        properties.setProperty("filterName", "myFilter");
        SmartFilterConfig config = new SmartFilterConfig(null, properties);
        assertEquals("myFilter", config.getFilterName());
    }

    /**
     * Test getServletContext method.
     */
    @Test
    public void testGetServletContext() {
        SmartFilterConfig config = new SmartFilterConfig(null, null);
        assertNull(config.getServletContext());
    }

    /**
     * Test getInitParameter method.
     */
    @Test
    public void testGetInitParameter() {
        Properties properties = new Properties();
        properties.setProperty("myProperty", "myPropertyValue");
        SmartFilterConfig config = new SmartFilterConfig(null, properties);
        assertEquals("myPropertyValue", config.getInitParameter("myProperty"));
    }

    /**
     * Test getInitParameterNames method.
     */
    @Test
    public void testGetInitParameterNames() {
        Properties properties = new Properties();
        properties.setProperty("myProperty", "myPropertyValue");
        SmartFilterConfig config = new SmartFilterConfig(null, properties);
        assertEquals("myProperty", config.getInitParameterNames().nextElement());
    }
}
