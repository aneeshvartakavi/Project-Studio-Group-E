// Message routing
// Aneesh Vartakavi 
// GTCMT

package messageProcessing;

import com.cycling74.max.Atom;
import com.cycling74.max.MaxObject;

public class Route extends MaxObject{
	
	public Route()
	{
		// One inlet, 8 outlets
		declareIO(1,8);
		// Not creating the info outlet
		createInfoOutlet(false);
		// Inlet assists
		setInletAssist(new String[] { "Send an encoded message to route"});
		//setOutletAssist(new String[] { "Decoded messages", "Sequencer Quantization level","UserID"});
		
	}
	
	public void list(Atom[] args)
	{
		// Word of caution, do not send an unintended message in, there is no guard against that.	
		if(args.length>0)
		{
			int userID = args[0].getInt();
			outlet(userID,args);
		}
				    
	}

}
