import React, {Component} from "react";
import {Link} from "react-router-dom";
import {MenuItems} from "./MenuItems";
import "./Navbar.css";
import kitePicture from "../img/kite6.png";
import Button from "./Button/Button";

class Navbar extends Component {
    state = {clicked: false};

    handleClick = () => {
        //anlik degerinin tersini yapar true <=> false
        this.setState({clicked: !this.state.clicked});
    };

    render() {
        const {clicked} = this.state;

        return (
            <nav className="NavbarItems">
                <Link to="/" className="navbar-logo">
                    <h1>
                        <img width="45" src={kitePicture} alt="kite-logo"></img>
                        Kite
                    </h1>
                </Link>
                <div className="menu-icon" onClick={this.handleClick}>
                    <i className={clicked ? "fas fa-times" : "fas fa-bars"}></i>
                </div>

                <ul className={clicked ? "nav-menu active" : "nav-menu"}>
                    {MenuItems.map((item, index) => {
                        return (
                            <li>
                                <Link to={item.url} className={item.cName}>
                                    {item.title}
                                </Link>
                            </li>
                        );
                    })}
                </ul>
                <Link to="/signup">
                    <Button className="raise" text="Sign Up"/>
                </Link>
                <Link to="/login">
                    <Button className="raise" text="Login"/>
                </Link>
            </nav>
        );
    }
}

export default Navbar;
