/**
 * Copyright (C) 2018 Carl-Eric Menzel <cmenzel@wicketbuch.de>
 * and possibly other appendablerepeater contributors.
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
package de.wicketbuch.extensions.classpathpreloader.examples;

import de.wicketbuch.extensions.classpathpreloader.ClasspathPreloader;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created by calle on 19/04/16.
 */
public class ClasspathPreloaderApplication extends WebApplication
{
	@Override
	public Class<? extends Page> getHomePage()
	{
		return HomePage.class;
	}

	@Override
	protected void init()
	{
		super.init();
		getMarkupSettings().setAutomaticLinking(true);
		ClasspathPreloader.configure(this);
	}
}