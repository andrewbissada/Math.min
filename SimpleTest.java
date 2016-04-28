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



import junit.framework.TestCase;

public class SimpleTest extends TestCase
{


	public void testMin() {
		
		//TESTS FOR NODE COVERAGE
		
				
		//Test for Node Coverage path: (1,2,4,8,10) 
		assertEquals(1.0f, Simple.min(1.0f,2.0f));

		//Test for Node Coverage path: (1,2,4,8,9) 
		assertEquals(1.0f, Simple.min(3.0f,1.0f));
		
		//Test Node Coverage (1,2,4,5,6,7) 
		assertEquals(-0.0f, Simple.min(+0.0f,-0.0f));
		
		//Test for Node Coverage path: (1,2,3) 
		assertEquals(0.0f/0.0f, Simple.min(0.0f/0.0f, 0.0f));
				
				
		
		
		
		//TESTS FOR EDGE COVERAGE
		
		//Test for Edge Coverage path: (1,2,4,5,8,10) 
		assertEquals(0.0f, Simple.min(0.0f, 2.0f));
		
		//Test for Edge Coverage path: (1,2,4,5,6,8,10) 
		assertEquals(0.0f, Simple.min(0.0f,+0.0f));
		
		
		
		
		
		//TESTS FOR EDGE-PAIR COVERAGE
		
		//Test for Edge-Pair Coverage path: (1,2,4,5,8,9) 
		assertEquals(-2.0f, Simple.min(0.0f,-2.0f));
		
		//Test for Edge-Pair Coverage path: (1,2,4,5,6,8,9)
		assertEquals(0.0f,Simple.min(+0.0f,0.0f));		
		
		
	}
	
}