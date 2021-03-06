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
package psdi.app.bim.viewer.lmv;

import java.rmi.RemoteException;

import psdi.mbo.Mbo;
import psdi.mbo.MboServerInterface;
import psdi.mbo.MboSet;
import psdi.mbo.NonPersistentMboSet;
import psdi.util.MXException;

public class BucketAccessSet extends NonPersistentMboSet implements BucketAccessSetRemote 
{
	
    /** 
     * Construct the set of Non-Persistent Custom Mbos.
     * @param ms The MboServerInterface NonPersistentCustomMboSet uses to access 
     * internals of the MXServer.
     */
	public BucketAccessSet(
		MboServerInterface ms
	) 
    	throws RemoteException
	{
        super(ms);
    }

    /** 
     * Factory method to create non-persistentcustom mbos.
     * @param ms the NonPersistentCustomMbo  MboSet.
     * @return a non-persistent custom Mbo.
     */
	@Override
    protected Mbo getMboInstance(MboSet ms) 
                        throws MXException, RemoteException
	{
		return new BucketAccess(ms);
	}
	
}
