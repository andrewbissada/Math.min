/**
 * Cobertura - http://cobertura.sourceforge.net/
 *
 * Copyright (C) 2003 jcoverage ltd.
 * Copyright (C) 2005 Mark Doliner <thekingant@users.sourceforge.net>
 *
 * Cobertura is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2 of the License,
 * or (at your option) any later version.
 *
 * Cobertura is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Cobertura; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307
 * USA
 */

package com.example.simple;

//import java.util.Collection;
//import java.util.Iterator;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import java.util.Random;

import sun.misc.FloatConsts;
import sun.misc.DoubleConsts;

public class Simple
{

	//private static final Logger logger = LoggerFactory.getLogger(Simple.class);
/*
	public int square(int x)
	{
		if (logger.isDebugEnabled())
		{
			logger.debug("x: " + x);
		}

		int result = x * x;

		if (logger.isDebugEnabled())
		{
			logger.debug("result: " + result);
		}

		return result;
	}

	public int f(int x)
	{
		if (logger.isDebugEnabled())
		{
			logger.debug("x: " + x);
		}

		if (x < 0)
		{
			if (logger.isDebugEnabled())
			{
				logger.debug("negative x");
			}

			return square(x);
		}
		else if ((x >= 0) && (x <= 5))
		{
			if (logger.isDebugEnabled())
			{
				logger.debug("0<=x<=5");
			}

			return x + 3;
		}
		else
		{
			return 2 * x;
		}
	}

	public int sum(Collection c)
	{
		int result = 0;

		for (Iterator i = c.iterator(); i.hasNext();)
		{
			int value = ((Number)i.next()).intValue();

			if (logger.isDebugEnabled())
			{
				logger.debug("value: " + value);
			}

			result += value;
		}

		if (logger.isDebugEnabled())
		{
			logger.debug("result: " + result);
		}

		return result;
	} */
	
private static long negativeZeroFloatBits  = Float.floatToRawIntBits(-0.0f);
    
    /**
     * Returns the smaller of two {@code float} values.  That is,
     * the result is the value closer to negative infinity. If the
     * arguments have the same value, the result is that same
     * value. If either value is NaN, then the result is NaN.  Unlike
     * the numerical comparison operators, this method considers
     * negative zero to be strictly smaller than positive zero.  If
     * one argument is positive zero and the other is negative zero,
     * the result is negative zero.
     *
     * @param   a   an argument.
     * @param   b   another argument.
     * @return  the smaller of {@code a} and {@code b}.
     */
    public static float min(float a, float b) {
        if (a != a)
            return a;   // a is NaN
        if ((a == 0.0f) &&
            (b == 0.0f) &&
            (Float.floatToRawIntBits(b) == negativeZeroFloatBits)) {
            // Raw conversion ok since NaN can't map to -0.0.
            return b;
        }
        return (a <= b) ? a : b;
    }
}