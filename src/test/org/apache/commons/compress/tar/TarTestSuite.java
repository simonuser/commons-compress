/*
 * Copyright 2002,2004 The Apache Software Foundation.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.compress.tar;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * A basic test suite that tests all the tar package.
 */
public class TarTestSuite
{
    public static Test suite()
    {
        final TestSuite suite = new TestSuite( "Tar Utilities" );
        return suite;
    }
}
