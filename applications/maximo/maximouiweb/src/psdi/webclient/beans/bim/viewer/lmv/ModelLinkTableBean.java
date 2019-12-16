/**
* Copyright IBM Corporation 2009-2017
*
* Licensed under the Eclipse Public License - v 1.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* https://www.eclipse.org/legal/epl-v10.html
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
* 
* @Author Doug Wood
**/
package psdi.webclient.beans.bim.viewer.lmv;

import java.rmi.RemoteException;

import psdi.util.MXException;



/**
 * @author Doug Wood	
 * This bean is used to manage storage buckets for the Autodesk Large Model Viewer.
 */
public class ModelLinkTableBean extends BaseManageBean
{
	public static final String DLG_MODEL_LINK = "LMV_MODEL_LINK";
	public int link() 
		throws MXException, 
		       RemoteException
	{
		displayDialog( DLG_MODEL_LINK );
		return EVENT_HANDLED;
	}
	
	public int deleteLink()
		throws MXException, 
	       RemoteException
	{
		instantdelete();
		save();
		return EVENT_HANDLED;
	}
}