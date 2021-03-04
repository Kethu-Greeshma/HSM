import React from 'react';
import {Link} from  'react-router-dom';

const CreateViewHistoryButton = () => {
  return(
   <React.Fragment>
         <Link to="viewHistory" className="btn btn-lg btn-info">
            View History
        </Link>
   </React.Fragment>
  );  
}
export default CreateViewHistoryButton;