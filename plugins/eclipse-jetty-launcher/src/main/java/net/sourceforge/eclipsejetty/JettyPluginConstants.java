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
package net.sourceforge.eclipsejetty;

/**
 * Constants for the Jetty plugin.
 * 
 * @author Christian K&ouml;berl
 */
public interface JettyPluginConstants
{
	public static final String LAUNCH_CONFIG_TYPE = JettyPlugin.PLUGIN_ID + ".launchConfigurationType";

	public static final String ATTR_CONTEXT = JettyPlugin.PLUGIN_ID + ".context";

	public static final String ATTR_WEBAPPDIR = JettyPlugin.PLUGIN_ID + ".webappdir";

	public static final String ATTR_PORT = JettyPlugin.PLUGIN_ID + ".port";

	public static final String ATTR_LAUNCHER_EXCLUDED_LIBS = JettyPlugin.PLUGIN_ID + ".launcher.excludeLibs";

	public static final String DEFAULT_LAUNCHER_EXCLUDED_LIBS = ".*servlet-api.*, .*selenium-server.*standalone\\.jar";

	public static final String ATTR_JETTY_PATH = JettyPlugin.PLUGIN_ID + ".jetty.path";

	public static final String ATTR_JETTY_VERSION = JettyPlugin.PLUGIN_ID + ".jetty.version";
	
	public static final String AUTO_JETTY_VERSION = "auto";
	
	public static final String V5_JETTY_VERSION = "5";
	
	public static final String V6_JETTY_VERSION = "6";
	
	public static final String V7_JETTY_VERSION = "7";
	
	public static final String V8_JETTY_VERSION = "8";

	public static final String ATTR_JSP_ENABLED = JettyPlugin.PLUGIN_ID + ".jsp.enabled";

	public static final String DEFAULT_BOOTSTRAP_CLASS_NAME = "net.sourceforge.eclipsejetty.launch.JettyLauncherMain";

	public static final String JETTY7_BOOTSTRAP_CLASS_NAME = "net.sourceforge.eclipsejetty.launch.Jetty7LauncherMain";

	public static final String CLASSPATH_PROVIDER_JETTY = JettyPlugin.PLUGIN_ID + ".JettyWebAppClassPathProvider";

	public static final String ATTR_JSP_ENABLED_DEFAULT = "false";
}
