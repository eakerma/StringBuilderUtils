package edu.uark.util;

import java.util.*;
import org.apache.commons.lang.Validate;

public final class StringBuilderUtils
{
	//StringBuilder doesn't have a decent replace method
	public static void replaceAll( final StringBuilder sb, final String search, final String replace )
	{
		Validate.notNull( sb );
		Validate.notEmpty( search );
		Validate.notNull( replace );
	
		while ( true )
		{
			final int start = sb.indexOf( search );
			if ( start == -1 ) break;
			
			final int end = start + search.length();
			sb.replace( start, end, replace );
		}
	}

	public static void replaceAll( final StringBuilder sb, final Map<String,String> m )
	{
		Validate.notNull( sb );
		Validate.notNull( m );

		for ( final Map.Entry<String,String> me : m.entrySet() )
		{
			replaceAll( sb, me.getKey(), me.getValue() );
		}
	}
}