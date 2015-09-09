package edu.uark.util.stringbuilderutils;

import java.io.*;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Michael Akerman
 */
public class StringBuilderUtilsTest
{
	@Test
	public void testReplaceAll () throws IOException
	{
		final StringBuilder sb = new StringBuilder( "tacos" );
		StringBuilderUtils.replaceAll( sb, "t", "+" );
		StringBuilderUtils.replaceAll( sb, "a", "@" );
		StringBuilderUtils.replaceAll( sb, "o", "0" );
		StringBuilderUtils.replaceAll( sb, "s", "$" );
		
		assertEquals( "+@c0$", sb.toString() );
	}
}
