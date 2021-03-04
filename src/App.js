import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import HeaderComponent from './components/layout/HeaderComponent';
import store from './store';
import {BrowserRouter as Router, Route} from  'react-router-dom';
import {Provider} from 'react-redux';
import Finance from './components/Finance';
function App() {
  return (
    <Provider store={store}>
      <Router>
      <div>
        <HeaderComponent/>
        { <Route path="/finance" component={Finance}/>
        /*<Route path="/addProject" component={AddProject}/>
        <Route path="/updateProject/:id" component={UpdateProject}/> */}
      </div>
    </Router>
    </Provider>
  );
}

export default App;
