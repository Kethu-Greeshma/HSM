import React, { Component } from 'react'
// import ProjectItem from './ProjectItem'
import CreateGenerateBillButton from './patients/CreateGenerateBillButton';
import CreateViewReportButton from './patients/CreateViewReportButton';
import CreateViewHistoryButton from './patients/CreateViewHistoryButton';
import {connect} from 'react-redux';
// import {getProjects} from '../actions/ProjectActions';
import {PropTypes} from 'prop-types';


class Finance extends Component {
    // componentDidMount(){
    //     this.props.getProjects();
    // }
    render() {
        // const {projects} = this.props.projects;
        return (
        <div className="projects">
            <div className="container">
                <div className="row">
                    <div className="col-md-12">
                        <h1 className="display-4 text-center">Finance</h1>
                   
                        <p className="financecss"><CreateGenerateBillButton/></p>
                        <p className="financecss"><CreateViewReportButton/></p>
                        <p className="financecss"><CreateViewHistoryButton/></p>
                        <br />
                        <hr />

                        {/* {
                            projects.map(project=>(
                                <ProjectItem key={project.id} project={project}/> 
                            ))
                        } */}
                       
                       

                    </div>
                </div>
            </div>
        </div>
        )
    }
}

// Dashboard.propTypes = {
//     projects:PropTypes.object.isRequired,
//     getProjects:PropTypes.func.isRequired
// }

// const mapStateToProps = state => ({
//     projects:state.projects
// });
// export default connect(mapStateToProps,{getProjects})(Dashboard);
export default Finance;
