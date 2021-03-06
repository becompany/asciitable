/* Copyright 2014 Sven van der Meer <vdmeer.sven@mykolab.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.vandermeer.asciitable.v2.themes;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests for {@link V2_E_TableThemes}.
 *
 * @author     Sven van der Meer &lt;vdmeer.sven@mykolab.com&gt;
 * @version    v0.2.3 build 150910 (10-Sep-15) for Java 1.7
 * @since      v0.0.8
 */
public class Test_V2_E_TableThemes {

	@Test
	public void test_Themes(){
		for(V2_E_TableThemes t : V2_E_TableThemes.values()){
			assertTrue(t.get()!=null);
			ThemeValidator.validateTableTheme(t.get());
			System.out.println(t.name() + "\n" + t.get().toDoc() + "\n\n");
		}
	}

}
