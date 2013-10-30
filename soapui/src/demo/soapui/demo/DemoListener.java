/*
 *  SoapUI, copyright (C) 2004-2012 smartbear.com
 *
 *  SoapUI is free software; you can redistribute it and/or modify it under the
 *  terms of version 2.1 of the GNU Lesser General Public License as published by 
 *  the Free Software Foundation.
 *
 *  SoapUI is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 *  even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 *  See the GNU Lesser General Public License for more details at gnu.org.
 */

package soapui.demo;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.support.TestRunListenerAdapter;
import com.eviware.soapui.model.testsuite.TestRunContext;
import com.eviware.soapui.model.testsuite.TestRunner;

public class DemoListener extends TestRunListenerAdapter
{
	private long startTime;

	public void beforeRun( TestRunner testRunner, TestRunContext runContext )
	{
		startTime = System.nanoTime();
	}
	
	public void afterRun( TestRunner testRunner, TestRunContext runContext )
	{
		long endTime = System.nanoTime();
		SoapUI.log.info( "TestCase [" + testRunner.getTestCase().getName() + "] took " + (endTime-startTime) + " nanoseconds." );
	}
}
