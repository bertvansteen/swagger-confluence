/*
 * Copyright 2016 Aaron Knight
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.slkdev.swagger.confluence.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConfluenceAPIExceptionTest {

    @Test
    public void testSwaggerConfluenceConfigurationExceptionWithNoCause(){
        final String message = "message";

        final ConfluenceAPIException confluenceAPIException =
                new ConfluenceAPIException(message);

        assertEquals("Expected Message Doesn't Match", message,
                confluenceAPIException.getMessage());
    }

    @Test
    public void testConfluenceAPIExceptionWithCause(){
        final String message = "message";
        final Throwable cause = new Exception();

        final ConfluenceAPIException confluenceAPIException =
                new ConfluenceAPIException(message, cause);

        assertEquals("Expected Message Doesn't Match", message,
                confluenceAPIException.getMessage());
        assertEquals("Expected Cause Doesn't Match", cause,
                confluenceAPIException.getCause());
    }

}
