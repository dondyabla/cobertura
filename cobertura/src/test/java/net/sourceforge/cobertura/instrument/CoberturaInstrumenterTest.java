/*
 * Cobertura - http://cobertura.sourceforge.net/
 *
 * Copyright (C) 2011 Piotr Tabor
 *
 * Note: This file is dual licensed under the GPL and the Apache
 * Source License (so that it can be used from both the main
 * Cobertura classes and the ant tasks).
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

package net.sourceforge.cobertura.instrument;

import org.junit.Test;

import java.io.File;

public class CoberturaInstrumenterTest {
	private final CoberturaInstrumenter coberturaInstrumenter = new CoberturaInstrumenter();

	@Test
	public void instrumentNotExisting() {
		coberturaInstrumenter.setDestinationDirectory(new File(System
				.getProperty("java.io.tmpdir")));
		coberturaInstrumenter.addInstrumentationToSingleClass(new File(
				"test/net/sourceforge/cobertura/instrument/notExisting.class"));
	}

	@Test
	public void instrumentExisting() throws ClassNotFoundException {
		coberturaInstrumenter.setDestinationDirectory(new File("target",
				"build"));
		coberturaInstrumenter.addInstrumentationToSingleClass(new File(
				"src/test/resources/coberturaInstrumenterTest/Test1.class"));
	}
}
