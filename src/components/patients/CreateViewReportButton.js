import React from 'react';
import {Link} from  'react-router-dom';

const CreateViewReportButton = () => {
  return(
   <React.Fragment>
        <Link to="viewReport" className="btn btn-lg btn-info">
            View Report
        </Link>
   </React.Fragment>
  );  
}
export default CreateViewReportButton;