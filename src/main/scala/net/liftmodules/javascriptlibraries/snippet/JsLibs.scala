/*
	Copyright 2012 Spiral Arm Ltd

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.package bootstrap.liftmodules
*/

package net.liftmodules.javascriptlibraries
package snippet

import scala.xml._

import net.liftweb.util.Props._

/**
 */
object JsLibs {

  def modernizr = mode match {
    case RunModes.Production ⇒ <script src="/js/modernizr-2.0.6.js" type="text/javascript"></script>
    case _                   ⇒ <script src="/js/modernizr-development-2.0.6.js" type="text/javascript"></script>
  }

  def jquery = mode match {
    case RunModes.Production ⇒ <script src="/js/jquery-1.7.2.min.js" type="text/javascript"></script>
    case _                   ⇒ <script src="/js/jquery-1.7.2.js" type="text/javascript"></script>
  }

}
