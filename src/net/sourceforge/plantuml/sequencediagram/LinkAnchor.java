/* ========================================================================
 * PlantUML : a free UML diagram generator
 * ========================================================================
 *
 * (C) Copyright 2009-2020, Arnaud Roques
 *
 * Project Info:  http://plantuml.com
 * 
 * If you like this project or if you find it useful, you can support us at:
 *
 * This file is part of PlantUML.
 *
 * PlantUML is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PlantUML distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 *
 * Original Author:  Arnaud Roques
 * 
 *
 */
package net.sourceforge.plantuml.sequencediagram;

public class LinkAnchor {

	private final String anchor1;
	private final String anchor2;
	private final String message;

	public LinkAnchor(String anchor1, String anchor2, String message) {
		this.anchor1 = anchor1;
		this.anchor2 = anchor2;
		this.message = message;
	}

	@Override
	public String toString() {
		return anchor1 + "<->" + anchor2 + " " + message;
	}

	public final String getAnchor1() {
		return anchor1;
	}

	public final String getAnchor2() {
		return anchor2;
	}

	public final String getMessage() {
		return message;
	}

}