import {Component} from "react";
import kitePicture from "../img/kite.png";
import {Link} from "react-router-dom";

class TopBar extends Component {
    render() {
        return (
            <div className="shadow-sm bg-light mb-2">
                <nav className="navbar navbar-light container navbar-expand">
                    <Link className="navbar-brand" to="/">
                        <img src={kitePicture} alt="Kite Logo" width="60"/>
                        Kite
                    </Link>

                    <ul className="navbar-nav ms-auto">
                        <li>
                            <Link className="nav-link" to="/">
                                Home Page
                            </Link>
                        </li>
                        <li>
                            <Link className="nav-link" to="/educations">
                                Educations
                            </Link>
                        </li>
                        <li>
                            <Link className="nav-link" to="/articals">
                                Articals
                            </Link>
                        </li>
                        <li>
                            <div class="input-group mb-2">
                                <input
                                    type="text"
                                    class="form-control"
                                    placeholder="Search"
                                    aria-label="Search"
                                    aria-describedby="basic-addon1"
                                />
                                <i className="input-group-text material-icons">search</i>
                            </div>
                        </li>
                        <li>
                            <Link className="nav-link" to="/login">
                                Login
                            </Link>
                        </li>
                        <li>
                            <Link className="nav-link" to="/signup">
                                Sign Up
                            </Link>
                        </li>
                    </ul>
                </nav>
            </div>
        );
    }
}

export default TopBar;
