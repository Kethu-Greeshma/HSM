import React from 'react';
import {Link} from  'react-router-dom';

const CreateGenerateBillButton = () => {
  return(
   <React.Fragment>
        <Link to="generateBill" className="btn btn-lg btn-info">
            Generate Bill
        </Link>
        
   </React.Fragment>
  );  
}
export default CreateGenerateBillButton;