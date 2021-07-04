import "bootstrap/dist/css/bootstrap.min.css";
import Navbar from "../src/components/Navbar/Navbar";
import HomePage from "./page/HomePage";
import LoginPage from "./page/LoginPage";
import UserSignupPage from "./page/UserSignupPage";
import Educations from "./page/Educations";
import {
    HashRouter as Router,
    Route,
    Redirect,
    Switch,
} from "react-router-dom";
import Articals from "./page/Articals";

function App() {
    return (
        <div>
            <Router>
                <Navbar/>
                <Switch>
                    <Route exact path="/" component={HomePage}/>
                    <Route path="/login" component={LoginPage}/>
                    <Route path="/signup" component={UserSignupPage}/>
                    <Route path="/educations" component={Educations}/>
                    <Route path="/articals" component={Articals}/>
                    <Redirect to="/"/>
                </Switch>
            </Router>
        </div>
    );
}

export default App;
