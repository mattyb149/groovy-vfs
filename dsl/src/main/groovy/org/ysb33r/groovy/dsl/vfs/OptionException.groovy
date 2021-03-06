// ============================================================================
// Copyright (C) Schalk W. Cronje 2012-2013
//
//
// This software is licensed under the Apache License 2.0
// See http://www.apache.org/licenses/LICENSE-2.0 for license details
//
// Unless required by applicable law or agreed to in writing, software distributed under the License is
// distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and limitations under the License.
//
// ============================================================================
/**
 * 
 */
package org.ysb33r.groovy.dsl.vfs
import groovy.transform.CompileStatic

/**
 * @author Schalk W. Cronj�
 *
 */
@CompileStatic
class OptionException extends Exception {

	/**
	 * @param message
	 */
	public OptionException(String message) {
		super(message)
	}

}
