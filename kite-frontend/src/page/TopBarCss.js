import {Component} from "react";
import {Link} from "react-router-dom";

class TopBarCss extends Component {
    render() {
        const menu = document.querySelector("#mobile-menu");
        const menuLinks = document.querySelector(".nav-menu");

        // if (menu) {
        //   menu.addEventListener("click", function name() {
        //     menu.classList.toggle("is-active");
        //     menuLinks.classList.toggle("active");
        //   });
        // }

        const onClick = () => {
            if (
                menu.parentElement !== null &&
                !menu.parentElement.classList.contains("#mobile-menu")
            ) {
                menu.classList.toggle("is-active");
                menuLinks.classList.toggle("active");
            }
        };

        return (
            <div className="nav-container">
                <nav className="navbar">
                    <h1 id="navbar-logo">Kite</h1>
                    <div className="menu-toggle" id="mobile-menu" onClick={onClick}>
                        <span className="bar"></span>
                        <span className="bar"></span>
                        <span className="bar"></span>
                    </div>
                    <ul className="nav-menu">
                        <li>
                            <Link to="/" className="nav-links">
                                Home Page
                            </Link>
                        </li>
                        <li>
                            <Link to="/articals" className="nav-links">
                                Articals
                            </Link>
                        </li>
                        <li>
                            <Link to="/login" className="nav-links">
                                Education
                            </Link>
                        </li>
                        <li>
                            <Link to="/signup" className="nav-links nav-links-btn">
                                Sign Up
                            </Link>
                        </li>
                        <li>
                            <Link to="/" className="nav-links">
                                Login
                            </Link>
                        </li>
                    </ul>
                </nav>
            </div>
        );
    }
}

export default TopBarCss;
