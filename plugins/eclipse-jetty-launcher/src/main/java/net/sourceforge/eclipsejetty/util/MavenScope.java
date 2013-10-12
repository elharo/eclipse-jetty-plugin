// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package net.sourceforge.eclipsejetty.util;

import net.sourceforge.eclipsejetty.JettyPluginUtils;
import net.sourceforge.eclipsejetty.Messages;

public enum MavenScope
{

    NONE(JettyPluginUtils.BLANK),
    COMPILE("compile"), //$NON-NLS-1$
    PROVIDED("provided"), //$NON-NLS-1$
    RUNTIME("runtime"), //$NON-NLS-1$
    TEST("test"), //$NON-NLS-1$
    SYSTEM("system"), //$NON-NLS-1$
    IMPORT("import"); //$NON-NLS-1$

    private final String key;

    private MavenScope(String key)
    {
        this.key = key;
    }

    public String key()
    {
        return key;
    }

    @Override
    public String toString()
    {
        return key;
    }

    public static MavenScope to(String key)
    {
        if (key == null)
        {
            return null;
        }

        for (MavenScope value : MavenScope.values())
        {
            if (key.equalsIgnoreCase(value.key()))
            {
                return value;
            }
        }

        throw new IllegalArgumentException(String.format(Messages.mavenScope_unknown, key));
    }
}
